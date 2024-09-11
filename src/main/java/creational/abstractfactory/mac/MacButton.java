package creational.abstractfactory.mac;

import creational.abstractfactory.Button;

public class MacButton extends Button {
    @Override
    public void create() {
        System.out.println("Create Mac Button");
    }
}
