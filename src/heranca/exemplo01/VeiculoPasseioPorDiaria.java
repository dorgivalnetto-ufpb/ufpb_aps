package heranca.exemplo01;

public class VeiculoPasseioPorDiaria extends Veiculo{


    public VeiculoPasseioPorDiaria(String placa, int horasEstacionadas) {
        super(placa, horasEstacionadas);
    }

    @Override
    public double calcularValor() {
        int dias = (int)Math.ceil(horasEstacionadas / 24.0);
        return dias * 96.00;
    }
}
