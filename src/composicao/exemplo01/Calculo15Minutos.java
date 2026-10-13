package composicao.exemplo01;

public class Calculo15Minutos implements CalculoValor{
    private double valorPeriodo;

    public Calculo15Minutos(double valorPeriodo) {
        this.valorPeriodo = valorPeriodo;
    }

    @Override
    public double calcular(int tempoPermanencia) {
        double periodo = (double)Math.ceil(tempoPermanencia * 60)/15;
        return periodo * valorPeriodo;
    }
}
