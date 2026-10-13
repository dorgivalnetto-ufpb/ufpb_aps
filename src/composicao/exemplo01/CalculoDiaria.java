package composicao.exemplo01;

public class CalculoDiaria implements CalculoValor{
    private double valorDiaria;

    public CalculoDiaria(double valorDiaria){
        this.valorDiaria = valorDiaria;
    }

    @Override
    public double calcular(int tempoPermanencia) {
        int dias = (int)Math.ceil(tempoPermanencia / 24.0);
        return dias * valorDiaria;
    }
}
