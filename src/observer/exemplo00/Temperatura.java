package observer.exemplo00;

import java.util.ArrayList;
import java.util.List;

public class Temperatura implements Subject{

    private double valor;
    List<Observer> observers = new ArrayList<>();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        notificarObservador();
    }

    @Override
    public void adicionarObservador(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservador() {
        for(Observer observer: observers){
            observer.atualizar(valor);
        }
    }
}
