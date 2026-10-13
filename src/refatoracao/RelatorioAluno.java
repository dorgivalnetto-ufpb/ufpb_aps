package refatoracao;

public class RelatorioAluno {

    public void gerar(Aluno aluno, double media, String situacao){
        System.out.println("Gerando o relatório do aluno... ");
        System.out.println("Nome" + aluno.getNome());
        System.out.println("Média " + media);
        System.out.println("Situação" + situacao);
        System.out.println("Relatório gerado com sucesso!");
    }

}
