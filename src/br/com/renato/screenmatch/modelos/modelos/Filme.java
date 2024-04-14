package br.com.renato.screenmatch.modelos.modelos;

import br.com.renato.screenmatch.modelos.calulos.Classificavel;


public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}