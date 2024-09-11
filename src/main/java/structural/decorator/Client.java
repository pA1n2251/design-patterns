package structural.decorator;

public class Client {

    public static void main(String[] args) {
        Notifier mailNotifier = new MailNotifier();
        mailNotifier.send("Hello. aleh.kameisha@gmail.com");

        System.out.println();

        Notifier smsTelegramMailNotifier = new SMSDecorator(new TelegramDecorator(new MailNotifier()));
        smsTelegramMailNotifier.send("Hello Oleg");

        System.out.println();

        Notifier allSourceNotifier = new SMSDecorator(new SkypeDecorator(new TelegramDecorator(new MailNotifier())));
        allSourceNotifier.send("Hello for all sources!");
    }
}
