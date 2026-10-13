package heranca.exemplo01;

public class Main {

    static void main() {
        Veiculo carro1 = new VeiculoPasseioPorHora("RHJ4f75", 30);
        carro1.imprimirConta();

        Veiculo carro2 = new VeiculoPasseioPorDiaria("ABC12Y6", 25);
        carro2.imprimirConta();
    }
}
