package behavioral.visitor;

public interface Animal {
    void say();
    void accept(Visitor visitor);
}
