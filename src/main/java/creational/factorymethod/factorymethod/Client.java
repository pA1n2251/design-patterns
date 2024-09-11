package creational.factorymethod.factorymethod;

public class Client {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.newComputer("desktop");

        computer.run();
        computer.stop();
    }

}
