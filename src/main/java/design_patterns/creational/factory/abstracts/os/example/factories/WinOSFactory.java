package design_patterns.creational.factory.abstracts.os.example.factories;

import design_patterns.creational.factory.abstracts.os.example.button.Button;
import design_patterns.creational.factory.abstracts.os.example.button.WinOsButton;
import design_patterns.creational.factory.abstracts.os.example.checkboxes.CheckBox;
import design_patterns.creational.factory.abstracts.os.example.checkboxes.WindowsCheckbox;

public class WinOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}