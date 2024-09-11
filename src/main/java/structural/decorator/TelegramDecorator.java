package structural.decorator;

public class TelegramDecorator implements Notifier {

    private Notifier wrappee;

    public TelegramDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        System.out.println("Send Telegram notification:" + message);
        wrappee.send(message);
    }
}
