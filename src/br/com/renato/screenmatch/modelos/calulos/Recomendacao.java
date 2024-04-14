package br.com.renato.screenmatch.modelos.calulos;

public class Recomendacao {


    public void filtra(Classificavel classificavel){
        if ( classificavel.getClassificacao()>=4){
            System.out.println("esta entre os preferidos");

        } else if (classificavel.getClassificacao()>=2) {
            System.out.println("muito bem avaliado nomomento");
        }else{
            System.out.println("coloque na sualista para assistir depois");
        }
    }
}
