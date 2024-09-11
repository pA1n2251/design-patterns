package creational.abstractfactory.win;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Button;
import creational.abstractfactory.Window;

public class WinFactory extends AbstractFactory {
    @Override
    public Window createWindow() {
        return new WinWindow();
    }

    @Override
    public Button createButton() {
        return new WinButton();
    }
}
