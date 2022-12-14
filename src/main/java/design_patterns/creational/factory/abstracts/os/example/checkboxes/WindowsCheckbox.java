package design_patterns.creational.factory.abstracts.os.example.checkboxes;


public class WindowsCheckbox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}