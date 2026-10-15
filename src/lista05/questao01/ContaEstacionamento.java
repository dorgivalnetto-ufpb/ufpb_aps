package lista05.questao01;

public class ContaEstacionamento {

    private String placa;
    private String modelo;
    private String proprietario;

    private long inicio;
    private long fim;

    private CalculoValor calculoValor;

    public ContaEstacionamento(String placa, String modelo, String proprietario, long inicio, long fim, CalculoValor calculoValor) {
        if (inicio < 0){
            throw new IllegalArgumentException("A entrada não pode ser negativo");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.inicio = inicio;

        setFim(fim);
        setCalculoValor(calculoValor);
    }

    public void setFim(long fim) {
        if(fim < inicio){
            throw new IllegalArgumentException("A saída não pode ser inferior a entrada");
        }
        this.fim = fim;
    }

    public void setCalculoValor(CalculoValor calculoValor) {
        if(calculoValor == null){
            throw new IllegalArgumentException("O objeto de cálculo não pode ser nulo");
        }
        this.calculoValor = calculoValor;
    }

    public long getHorasPermanencia(){
        return fim - inicio;
    }

    public double valorConta(){
        long horas = getHorasPermanencia();
        return calculoValor.calcular(horas);
    }

    public void imprimirRecibo() {
        System.out.println ("ContaEstacionamento{" +
                "Placa ='" + placa + '\'' +
                ", Modelo ='" + modelo + '\'' +
                ", Proprietário ='" + proprietario + '\'' +
                ", Entrada =" + inicio +
                ", Saída =" + fim +
                ", Permanência = " + getHorasPermanencia() + " horas" +
                ", Valor: R$ %.2f%n" + valorConta() +
                '}');
    }
}
