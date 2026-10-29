package factory.exemplo01.observer;

import factory.exemplo01.modelo.Carro;

public class NotificadorCliente implements ObservadorRevisao{

    @Override
    public void revisaoConcluida(Carro carro) {
        System.out.println("[Cliente] " + carro.getCliente() + " seu veículo " + carro.getModelo() + carro.getPlaca() + " está pronto.");
    }
}
