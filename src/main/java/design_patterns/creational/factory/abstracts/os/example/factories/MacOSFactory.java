package design_patterns.creational.factory.abstracts.os.example.factories;

import design_patterns.creational.factory.abstracts.os.example.button.Button;
import design_patterns.creational.factory.abstracts.os.example.button.MacOsButton;
import design_patterns.creational.factory.abstracts.os.example.checkboxes.CheckBox;
import design_patterns.creational.factory.abstracts.os.example.checkboxes.MacOSCheckbox;

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