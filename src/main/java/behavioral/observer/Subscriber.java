package behavioral.observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent() {
        System.out.println(name);
        System.out.println("Yahoo! I have new newspaper");
    }
}
