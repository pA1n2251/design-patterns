package behavioral.visitor;

public class Client {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.say();
        dog.say();
        System.out.println();

        Visitor visitor = new MoveVisitor();
        cat.accept(visitor);
        System.out.println();
        dog.accept(visitor);
    }
}
