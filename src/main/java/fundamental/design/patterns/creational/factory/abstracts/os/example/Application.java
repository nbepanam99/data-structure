package fundamental.design.patterns.creational.factory.abstracts.os.example;

import fundamental.design.patterns.creational.factory.abstracts.os.example.button.Button;
import fundamental.design.patterns.creational.factory.abstracts.os.example.checkboxes.CheckBox;
import fundamental.design.patterns.creational.factory.abstracts.os.example.factories.GUIFactory;

public class Application{
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}