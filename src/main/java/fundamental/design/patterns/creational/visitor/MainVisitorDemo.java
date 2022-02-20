package fundamental.design.patterns.creational.visitor;

public class MainVisitorDemo {
    static public void main(String[] args) {
        Car car = new Car("Electric");

        CarElementVisitor printVisitor = new CarElementPrintVisitor();
        CarElementVisitor doVisitor = new CarElementDoVisitor();

        printVisitor.visitCar(car);
        doVisitor.visitCar(car);

    }
}
