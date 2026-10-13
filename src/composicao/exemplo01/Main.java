package composicao.exemplo01;

public class Main {

    static void main() {
        ContaEstacionamento carro1 = new ContaEstacionamento("tgh4f90", 8, 14, new CalculoDiaria(40));
        carro1.imprimirRecibo();

        carro1.setCalculoValor(new Calculo15Minutos(4));
        carro1.imprimirRecibo();
    }
}
