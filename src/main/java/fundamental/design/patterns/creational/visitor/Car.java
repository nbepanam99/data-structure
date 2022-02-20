package fundamental.design.patterns.creational.visitor;

public class Car {

    CarElement[] elements;

    public Car(String type) {
        this.elements = new CarElement[]{
            new Wheel("front left"),
            new Wheel("front right"),
            new Wheel("back left"),
            new Wheel("back right"),
        new Engine(type)
        };
    }

    public CarElement[] getElements() {
        return elements.clone();
    }

}
