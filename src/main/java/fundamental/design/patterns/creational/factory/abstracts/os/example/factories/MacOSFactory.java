package fundamental.design.patterns.creational.factory.abstracts.os.example.factories;

import fundamental.design.patterns.creational.factory.abstracts.os.example.button.Button;
import fundamental.design.patterns.creational.factory.abstracts.os.example.button.MacOsButton;
import fundamental.design.patterns.creational.factory.abstracts.os.example.checkboxes.CheckBox;
import fundamental.design.patterns.creational.factory.abstracts.os.example.checkboxes.MacOSCheckbox;

public class MacOSFactory  implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}