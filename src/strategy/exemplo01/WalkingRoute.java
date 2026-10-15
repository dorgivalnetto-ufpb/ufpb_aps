package strategy.exemplo01;

public class WalkingRoute implements RouteStrategy{

    @Override
    public String buildRoute(String origem, String destino) {
        return "Rota de caminhada " + origem + " até " + destino;
    }
}
