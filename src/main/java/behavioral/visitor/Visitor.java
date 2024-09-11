package behavioral.visitor;

public interface Visitor {
    void visit(Cat cat);
    void visit(Dog dog);
}
