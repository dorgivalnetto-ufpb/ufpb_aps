package factory.exemplo01.modelo;

public class Carro {

    private final String placa;
    private final String modelo;
    private final String cliente;

    public Carro(String placa, String modelo, String cliente) {
        this.placa = placa;
        this.modelo = modelo;
        this.cliente = cliente;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCliente() {
        return cliente;
    }
}
