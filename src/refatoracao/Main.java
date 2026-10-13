package refatoracao;

import refatoracao.*;

public class Main{
    static void main() {
        Aluno aluno1 = new Aluno("Dorgival", "dorgival@dcx.ufpb.br", 8.0, 5.0, 4.0);

        AvaliadorAluno avaliador = new AvaliadorAluno();
        CalculadoraMedia calculadora = new CalculadoraMedia();
        EmailService emailService = new EmailService();
        RelatorioAluno relatorio = new RelatorioAluno();

        double media = calculadora.calcular(aluno1);
        String situacao = avaliador.obterSituacao(media);

        emailService.enviarResultado(aluno1, media, situacao);
        relatorio.gerar(aluno1, media, situacao);
    }
}
