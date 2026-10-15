package lista05.questao01;

public class CalculoMensal implements CalculoValor {

    private final double valorMensalidade;

    public CalculoMensal(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    @Override
    public double calcular(long horasPermanencia) {
        if (horasPermanencia < 0){
            throw new IllegalArgumentException("O tempo de permanência não pode ser negativo");
        }
        long meses = (long)Math.ceil(horasPermanencia / 720.0);
        return meses * valorMensalidade;
    }
}
