package design_patterns.creational.factory.abstracts.os.example.factories;

import design_patterns.creational.factory.abstracts.os.example.button.Button;
import design_patterns.creational.factory.abstracts.os.example.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
