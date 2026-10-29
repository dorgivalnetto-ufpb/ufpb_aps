package factory.exemplo01.factory;

import factory.exemplo01.observer.NotificadorCliente;
import factory.exemplo01.observer.ObservadorRevisao;

public class CriadorNotificadorCliente extends CriadorObservador{

    @Override
    public ObservadorRevisao criarObservador() {
        return new NotificadorCliente();
    }
}
