package refatoracao;

public class EmailService {

    public void enviarResultado(Aluno aluno, double media, String situacao){
        System.out.println("Enviar o email para: " + aluno.getEmail());
        System.out.println("Olá " + aluno.getNome() + "sua média é: " + media + "sua situação " + situacao);
    }
}
