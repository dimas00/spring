package br.csi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class Cliente {


        @GetMapping("/salvar")
        public void salvar (){
                System.out.println("salvar");
            }
        @GetMapping("/editar")
        public  void editar (){
        System.out.println("editar");
    }



}

