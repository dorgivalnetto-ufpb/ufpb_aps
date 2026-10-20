package nullobject.exemplo01;

public class Oficina {

    public void revisar(Carro carro){
        /*if(carro.getInjecao() != null){
            carro.getInjecao().ligar();
        }*/
        System.out.println("Revisando o carro: "+ carro.getModelo());
        //polimorfismo
        carro.getInjecao().ligar();
        System.out.println("Revisão concluída!");
    }
}
