package refatoracao;

public class AvaliadorAluno {

    public String obterSituacao(double media){
        if(media >= 7){
            return "Aprovado";
        } else if (media >= 4){
            return "Final";
        } else{
            return "Reprovado";
        }
    }
}
