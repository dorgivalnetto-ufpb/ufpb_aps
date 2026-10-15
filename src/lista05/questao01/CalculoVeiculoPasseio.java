package lista05.questao01;

public class CalculoVeiculoPasseio implements CalculoValor {

    private final CalculoValor calculoPorHora;
    private final CalculoValor calculoDiaria;
    private final CalculoValor calculoMensal;

    public CalculoVeiculoPasseio(double valorPorHora, double valorDiaria, double valorMensal) {
        this.calculoPorHora = new CalculoPorHora(valorPorHora);
        this.calculoDiaria = new CalculoDiaria(valorDiaria);
        this.calculoMensal = new CalculoMensal(valorMensal);
    }

    @Override
    public double calcular(long horasPermanencia) {
        if (horasPermanencia < 0){
            throw new IllegalArgumentException("O tempo de permanência não pode ser negativo");
        }
        CalculoValor calculoEscolhido;

        if(horasPermanencia <= 12){
            calculoEscolhido = calculoPorHora;
        } else if (horasPermanencia <=360){
            calculoEscolhido = calculoDiaria;
        } else{
            calculoEscolhido = calculoMensal;
        }
        return calculoEscolhido.calcular(horasPermanencia);
    }
}
