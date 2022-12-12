package fundamental.design.patterns.creational.factory.abstracts.os.example.button;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
