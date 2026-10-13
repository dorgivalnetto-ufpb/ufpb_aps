package heranca.exemplo01;

public class VeiculoPasseioPorHora extends Veiculo{


    public VeiculoPasseioPorHora(String placa, int horasEstacionadas) {
        super(placa, horasEstacionadas);
    }

    @Override
    public double calcularValor() {
        return horasEstacionadas * 4.00;
    }
}
