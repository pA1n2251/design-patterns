package behavioral.visitor;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("Woof woof woof woof woof");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
