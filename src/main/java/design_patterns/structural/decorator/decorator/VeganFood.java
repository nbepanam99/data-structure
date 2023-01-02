package design_patterns.structural.decorator.decorator;

public class VeganFood implements Food{
    @Override
    public String prepareFood() {
        return "Vegan Food";
    }

    @Override
    public double foodPrice() {
        return 50.0;
    }
}
