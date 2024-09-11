package creational.abstractfactory;

import creational.abstractfactory.mac.MacFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new MacFactory();
        Window window = factory.createWindow();
        Button button = factory.createButton();

        window.show();
        button.create();
     }
}
