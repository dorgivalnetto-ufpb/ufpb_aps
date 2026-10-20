package nullobject.exemplo01;

public class Main {

    public static void main(String[] args) {

        InjecaoEletronica a = null;
        System.out.println(a == null); //true
        //a.ligar();

        InjecaoEletronica b = new InjecaoEletronicaNull();
        System.out.println(b == null); //false
        b.ligar();

        Oficina oficina = new Oficina(new NotificadorReal());
        System.out.println("\nInjeção real");
        Carro gol = new Carro("Gol", new InjecaoeletronicaReal());
        System.out.println(gol.getModelo());
        oficina.revisar(gol);

        Oficina oficina2 = new Oficina(new NotificadorNulo());
        System.out.println("\nInjeção null");
        Carro fusca = new Carro("Fusca", new InjecaoEletronicaNull());
        oficina2.revisar(fusca);

        Oficina oficina3 = new Oficina(null);
        System.out.println("\nConverteu o objeto em Null Object");
        Carro carroAntigo = new Carro("Carro antigo", null);
        oficina3.revisar(carroAntigo);
    }
}
