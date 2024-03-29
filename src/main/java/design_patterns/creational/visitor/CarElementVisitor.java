package design_patterns.creational.visitor;

public interface CarElementVisitor {

    void visit(Engine engine);

    void visit(Wheel wheel);

    void visitCar(Car car);
}
