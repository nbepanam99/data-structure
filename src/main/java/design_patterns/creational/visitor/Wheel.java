package design_patterns.creational.visitor;

public class Wheel implements CarElement{

    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
