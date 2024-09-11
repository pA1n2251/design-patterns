package structural.decorator;

public class SkypeDecorator implements Notifier {

    private Notifier wrappee;

    public SkypeDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        System.out.println("Send Skype notification: " + message);
        wrappee.send(message);
    }
}
