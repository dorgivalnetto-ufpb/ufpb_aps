package observer.exemplo00;

public interface Subject {

    public void adicionarObservador(Observer observer);

    public void removerObservador(Observer observer);

    public void notificarObservador();
}
