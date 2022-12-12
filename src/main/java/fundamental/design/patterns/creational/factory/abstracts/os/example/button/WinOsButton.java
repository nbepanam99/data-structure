package fundamental.design.patterns.creational.factory.abstracts.os.example.button;

public class WinOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created WinOSButton.");
    }
}
