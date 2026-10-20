package nullobject.exemplo01;

public class NotificadorReal extends Notificador{


    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação: "  + mensagem);
    }
}
