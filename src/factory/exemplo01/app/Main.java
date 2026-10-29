package factory.exemplo01.app;

import factory.exemplo01.modelo.Carro;
import factory.exemplo01.servico.Oficina;

public class Main {

    public static void main(String[] args) {
        Oficina oficina = new Oficina();

        oficina.revisar(new Carro("ABC4F56", "Corolla", "Ana"));
        oficina.revisar(new Carro("XVF4D32", "Civic", "Bruno"));

    }
}
