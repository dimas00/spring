package br.csi.springmvc.controller;


import br.csi.springmvc.model.Livro;
import br.csi.springmvc.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/livro")
public class LivroController {

    @GetMapping("/listar")
    public String Listar(Model model){

        model.addAttribute("livros", new LivroService().getlivro());
        return "lista-livros";
    }

    @GetMapping("/adicionar")
    public String addlivro(Model model){

    model.addAttribute("livro", new Livro());

        return "add-livro";
    }

    @PostMapping("adicionar")
    public RedirectView addLivro(@ModelAttribute("livro") Livro livro, RedirectAttributes attributes) {

        RedirectView redirect = new RedirectView("/livro/adicionar", true);
        new LivroService().addLivro(livro);

        attributes.addAttribute("addSucesso",true);
        attributes.addAttribute("livroSalvo", livro);

        return redirect;






    }
}
