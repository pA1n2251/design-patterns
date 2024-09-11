package structural.decorator;

public class MailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Main sender");
        System.out.println("Send mail notification:" + message);
    }

}
