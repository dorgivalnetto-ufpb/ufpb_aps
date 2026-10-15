package lista05.questao01;

public class CalculoPorHora implements CalculoValor {

    private final double valorHora;

    public CalculoPorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcular(long horasPermanencia) {
        if (horasPermanencia < 0){
            throw new IllegalArgumentException("O tempo de permanência não pode ser negativo");
        }
        return horasPermanencia * valorHora;
    }
}
