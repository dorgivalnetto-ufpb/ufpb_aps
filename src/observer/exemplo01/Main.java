package observer.exemplo01;

public class Main {

    public static void main(String[] args) {
        MessagePublisher publisher = new MessagePublisher();

        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();

        publisher.attach(s1);
        publisher.attach(s2);

        publisher.notifyObserver(new Message("Primeira mensagem enviada"));

    }
}
