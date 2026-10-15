package lista05.questao01;

public class CalculoDiaria implements CalculoValor{
    private final double valorDiaria;

    public CalculoDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }


    @Override
    public double calcular(long horasPermanencia) {
        if (horasPermanencia < 0){
            throw new IllegalArgumentException("O tempo de permanência não pode ser negativo");
        }
        long dias = (long)Math.ceil(horasPermanencia / 24.0);
        return dias * valorDiaria;
    }
}
