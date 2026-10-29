package factory.exemplo01.strategy;

import factory.exemplo01.modelo.Carro;

public class RevisaoBasica implements EstrategiaRevisao{
    @Override
    public double calcularValor(Carro carro) {
        return 150.00;
    }

    @Override
    public String getDescricao() {
        return "Básica";
    }
}
