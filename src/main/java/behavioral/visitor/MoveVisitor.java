package behavioral.visitor;

public class MoveVisitor implements Visitor {
    @Override
    public void visit(Cat cat) {
        System.out.println("Move cat to street");
        cat.say();
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("Move dog to home");
        dog.say();
    }
}
