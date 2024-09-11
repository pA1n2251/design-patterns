package creational.abstractfactory.win;

import creational.abstractfactory.Window;

public class WinWindow extends Window {
    @Override
    public void show() {
        System.out.println("Show Windows window");
    }
}
