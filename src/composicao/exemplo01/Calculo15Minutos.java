package composicao.exemplo01;

public class Calculo15Minutos implements CalculoValor {

    private double valorPeriodo;

    public Calculo15Minutos(double valorPeriodo) {
        this.valorPeriodo = valorPeriodo;
    }

    @Override
    public double calcular(int tempoPermanencia) {
        int periodos = (int)Math.ceil((tempoPermanencia * 60)/15.0);
        return periodos * valorPeriodo;
    }
}
