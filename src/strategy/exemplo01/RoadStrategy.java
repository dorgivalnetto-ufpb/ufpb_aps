package strategy.exemplo01;

public class RoadStrategy implements RouteStrategy{

    @Override
    public String buildRoute(String origem, String destino) {
        return "Rota de carro: " + origem + " até " + destino;
    }
}
