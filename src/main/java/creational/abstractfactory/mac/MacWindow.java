package creational.abstractfactory.mac;

import creational.abstractfactory.Window;

public class MacWindow extends Window {
    @Override
    public void show() {
        System.out.println("Show Mac Window");
    }
}
