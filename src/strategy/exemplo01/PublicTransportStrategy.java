package strategy.exemplo01;

public class PublicTransportStrategy implements RouteStrategy{


    @Override
    public String buildRoute(String origem, String destino) {
        return "Rota utilizando transporte público de " + origem + " até " + destino;
    }
}
