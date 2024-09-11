package creational.abstractfactory.mac;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Button;
import creational.abstractfactory.Window;

public class MacFactory extends AbstractFactory {
    @Override
    public Window createWindow() {
        return new MacWindow();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
