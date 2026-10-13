package refatoracao;

public class CalculadoraMedia {

    public double calcular(Aluno aluno){
        return (aluno.getNota1() + aluno.getNota2() + aluno.getNota3())/3;
    }
}
