package nullobject.exemplo01;

public class Main {

    public static void main(String[] args) {

        InjecaoEletronica a = null;
        System.out.println(a == null); //true
        //a.ligar();

        InjecaoEletronica b = new InjecaoEletronicaNull();
        System.out.println(b == null); //false
        b.ligar();

        Oficina oficina = new Oficina();

        System.out.println("\nInjeção real");
        Carro gol = new Carro("Gol", new InjecaoeletronicaReal());
        System.out.println(gol.getModelo());
        oficina.revisar(gol);

        System.out.println("\nInjeção null");
        Carro fusca = new Carro("Fusca", new InjecaoEletronicaNull());
        oficina.revisar(fusca);

        System.out.println("\nConverteu o objeto em Null Object");
        Carro carroAntigo = new Carro("Carro antigo", null);
        oficina.revisar(carroAntigo);
    }
}
