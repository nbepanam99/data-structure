package fundamental.design.patterns.creational.factory.abstracts.os.example.factories;

import fundamental.design.patterns.creational.factory.abstracts.os.example.button.Button;
import fundamental.design.patterns.creational.factory.abstracts.os.example.button.WinOsButton;
import fundamental.design.patterns.creational.factory.abstracts.os.example.checkboxes.CheckBox;
import fundamental.design.patterns.creational.factory.abstracts.os.example.checkboxes.WindowsCheckbox;

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