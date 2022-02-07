package fundamental.design.patterns.creational.visitor;

public class CarElementDoVisitor implements CarElementVisitor{

    public void visit(Wheel wheel) {
        System.out.println("Kicking my "+ wheel.getName());
    }

    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }
    public void visitCar(Car car) {
        System.out.println("\nStarting my car");
        for(CarElement carElement : car.getElements()) {
            carElement.accept(this);
        }
        System.out.println("Started car");
    }
}
