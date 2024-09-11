package structural.decorator;

public class SMSDecorator implements Notifier {

    private Notifier wrappee;

    public SMSDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        System.out.println("Send SMS notification:" + message);
        wrappee.send(message);
    }
}
