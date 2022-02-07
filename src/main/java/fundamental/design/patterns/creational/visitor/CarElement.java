package fundamental.design.patterns.creational.visitor;

public interface CarElement {

    void accept(CarElementVisitor visitor);
}
