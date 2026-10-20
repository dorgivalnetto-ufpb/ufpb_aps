package nullobject.exemplo01;

public class Oficina {

    private Notificador notificador;

    public Oficina(Notificador notificador){
        if(notificador == null){
            this.notificador = new NotificadorNulo();
        } else{
            this.notificador = notificador;
        }
    }

    public void revisar(Carro carro){
        /*if(carro.getInjecao() != null){
            carro.getInjecao().ligar();
        }*/
        System.out.println("Revisando o carro: "+ carro.getModelo());
        //polimorfismo
        carro.getInjecao().ligar();
        System.out.println("Revisão concluída!");

        notificador.enviar("Seu carro " + carro.getModelo() + " ateá pronto para retirada");
    }
}
