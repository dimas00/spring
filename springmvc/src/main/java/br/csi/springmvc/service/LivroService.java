package br.csi.springmvc.service;

import br.csi.springmvc.dao.LivroDAO;
import br.csi.springmvc.model.Livro;

import java.util.ArrayList;

public class LivroService {

    private LivroDAO dao = new LivroDAO();
    public ArrayList<Livro>  getlivro (){
        return dao.getLivros();
    }


    public void addLivro(Livro livro) {

        dao.addLivro(livro);

    }
}
