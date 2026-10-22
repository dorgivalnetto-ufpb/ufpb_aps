package observer.exemplo00;

public class Main {

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

        Termometro termometroLab2 = new Termometro("Termômetro do lab 2");
        Termometro termometroExterno = new Termometro("Termômetro Externo");

        System.out.println("A temperatura foi alterada para 26");
        temperatura.adicionarObservador(termometroExterno);
        temperatura.setValor(26);

        temperatura.adicionarObservador(termometroLab2);
        System.out.println("A temperatura foi alterada para 22");
        temperatura.setValor(22);

        temperatura.removerObservador(termometroLab2);
        temperatura.setValor(30);


    }
}
