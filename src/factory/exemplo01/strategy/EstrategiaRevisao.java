package factory.exemplo01.strategy;

import factory.exemplo01.modelo.Carro;

public interface EstrategiaRevisao {

    double calcularValor(Carro carro);
    String getDescricao();

}
