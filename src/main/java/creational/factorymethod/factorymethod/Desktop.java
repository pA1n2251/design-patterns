package creational.factorymethod.factorymethod;

public class Desktop extends Computer {
    @Override
    public void run() {
        System.out.println("Desktop running");
    }

    @Override
    public void stop() {
        System.out.println("Desktop stopping");
    }
}
