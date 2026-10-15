package lista05.questao01;

public class Main {

    public static void main(String[] args) {

        long entrada = 8;

        ContaEstacionamento conta = new ContaEstacionamento("QWE-1234", "Toyota Corolla", "Dorgival Netto", entrada, 16,
                new CalculoVeiculoPasseio(4.00, 40.00, 500.00));

        long[] permanencias = {0, 6, 12, 13, 25, 360, 361, 721};

        System.out.println("==== Seleção automática da tarifa ====");

        for (long horas : permanencias) {
            conta.setFim(entrada + horas);

            System.out.printf("%d horas: R$ %.2f%n", conta.getHorasPermanencia(), conta.valorConta());
        }

        System.out.println("\n==== Recibo da mesma conta ====");
        conta.imprimirRecibo();

        System.out.println("\n==== Saída inválida ====");

        try {
            conta.setFim(entrada - 1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n==== Permanência negativa ====");

        try {
            CalculoValor calculo = new CalculoVeiculoPasseio(4.00, 40.00, 500.00);
            calculo.calcular(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}