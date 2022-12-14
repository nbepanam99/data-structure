package design_patterns.creational.visitor;

public class Engine implements CarElement{

    private String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

    public String getType() {
        return type;
    }
}
