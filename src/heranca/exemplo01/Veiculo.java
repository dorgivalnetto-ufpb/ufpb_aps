package heranca.exemplo01;

public abstract class Veiculo {

    protected String placa;
    protected int horasEstacionadas;

    public Veiculo(String placa, int horasEstacionadas) {
        this.placa = placa;
        this.horasEstacionadas = horasEstacionadas;
    }

    public abstract double calcularValor();

    public void imprimirConta(){
        System.out.println("Placa: " + placa);
        System.out.println("Horas estacionadas: " + horasEstacionadas);
        System.out.println("Valor a pagar: " + calcularValor());
    }
}
