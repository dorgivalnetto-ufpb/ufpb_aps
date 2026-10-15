package strategy.exemplo01;

public class Navigator {

    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String origem, String destino){
        String rota = routeStrategy.buildRoute(origem, destino);
        System.out.println(rota);
    }
}
