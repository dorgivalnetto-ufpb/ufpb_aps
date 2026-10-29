package factory.exemplo01.app;

import factory.exemplo01.factory.CriadorNotificadorCliente;
import factory.exemplo01.factory.CriadorObservador;
import factory.exemplo01.modelo.Carro;
import factory.exemplo01.servico.Oficina;
import factory.exemplo01.singleton.PainelVeiculosProntos;

public class Main {

    public static void main(String[] args) {
        Oficina oficina = new Oficina();

        CriadorObservador criadorCliente = new CriadorNotificadorCliente();
        criadorCliente.cadastrarNaOficina(oficina);

        PainelVeiculosProntos painel1 = PainelVeiculosProntos.getInstancia();
        PainelVeiculosProntos painel2 = PainelVeiculosProntos.getInstancia();
        System.out.println("O painel é único? " + (painel1 == painel2));

        oficina.cadastrarObservador(painel2);

        //observer
        oficina.revisar(new Carro("ABC4F56", "Corolla", "Ana"));
        oficina.revisar(new Carro("XVF4D32", "Civic", "Bruno"));

        painel2.exibirPainel();
    }
}
