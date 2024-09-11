package creational.abstractfactory.win;

import creational.abstractfactory.Button;

public class WinButton extends Button {
    @Override
    public void create() {
        System.out.println("Create Windows Button");
    }
}
