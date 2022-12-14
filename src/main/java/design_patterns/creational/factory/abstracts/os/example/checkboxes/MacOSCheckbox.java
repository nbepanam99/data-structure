package design_patterns.creational.factory.abstracts.os.example.checkboxes;

public class MacOSCheckbox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}