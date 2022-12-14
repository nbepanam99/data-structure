package design_patterns.creational.visitor;

public interface CarElement {

    void accept(CarElementVisitor visitor);
}
