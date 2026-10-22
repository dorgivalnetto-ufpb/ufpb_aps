package observer.exemplo00;

public class Termometro implements Observer{

    private String nome;

    public Termometro(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(double temperatura) {
        System.out.println("O " + nome + " está exibindo a temperatura " + temperatura + "C");
    }
}
