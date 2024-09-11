package creational.factorymethod.factorymethod;

public class Laptop extends Computer {
    @Override
    public void run() {
        System.out.println("Laptop running");
    }

    @Override
    public void stop() {
        System.out.println("Laptop stopping");
    }
}
