package composicao.exemplo01;

public class ContaEstacionamento {

    private String placa;

    private int inicio;
    private int fim;

    //Composição
    private CalculoValor calculoValor;

    public ContaEstacionamento(String placa, int inicio, int fim, CalculoValor calculoValor) {
        this.placa = placa;
        this.inicio = inicio;
        this.fim = fim;
        this.calculoValor = calculoValor;
    }

    public double valorConta(){
        int horas = fim - inicio;

        //polimorfismo
        return calculoValor.calcular(horas);
    }

    public void setCalculoValor(CalculoValor calculoValor){
        this.calculoValor = calculoValor;

    }

    public void imprimirRecibo(){
        System.out.println("Placa: " + placa);
        System.out.println("Entrada: " + inicio);
        System.out.println("Saída: " + fim);
        System.out.println("Valor: R$ " + valorConta());
    }
}
