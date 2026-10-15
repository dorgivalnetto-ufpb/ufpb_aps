package strategy.exemplo01;

public class Main {

    static void main() {
        Navigator navigator = new Navigator(new RoadStrategy());

        navigator.buildRoute("Hotel", "Praia");

        navigator.setRouteStrategy(new WalkingRoute());
        navigator.buildRoute("Museu", "Hotel");

        navigator.setRouteStrategy(new PublicTransportStrategy());
        navigator.buildRoute("Hotel", "Aeroporto");
    }
}
