package creational.factorymethod.factorymethod;

public class ComputerFactory {
    public static Computer newComputer(String type) {
        if ("laptop".equals(type)) {
            return new Laptop();
        } else if ("desktop".equals(type)) {
            return new Desktop();
        }
        return null;
    }
}
