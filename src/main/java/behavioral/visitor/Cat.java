package behavioral.visitor;

public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("Mew mew mew mew mew");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
