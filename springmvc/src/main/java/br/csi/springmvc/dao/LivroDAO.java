package br.csi.springmvc.dao;

import br.csi.springmvc.model.Livro;

import java.util.ArrayList;

public class LivroDAO {

    public static ArrayList<Livro> livros = new ArrayList<>();

    public LivroDAO(){

        livros.add((new Livro( 1, "java tools", "Fulano")));
        livros.add((new Livro (1, "ccs tools", "Siclano")));

    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }

    public void addLivro(Livro livro) {

        livros.add(livro);
    }
}
