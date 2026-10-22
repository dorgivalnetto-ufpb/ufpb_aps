package observer.exemplo01;

public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("Message Subscriber Two: " + m.getMessageContent());
    }
}
