package fundamental.design.patterns.creational.factory.abstracts.os.example.factories;

import fundamental.design.patterns.creational.factory.abstracts.os.example.button.Button;
import fundamental.design.patterns.creational.factory.abstracts.os.example.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
