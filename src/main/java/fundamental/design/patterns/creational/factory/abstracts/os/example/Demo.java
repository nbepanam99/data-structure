package fundamental.design.patterns.creational.factory.abstracts.os.example;

import fundamental.design.patterns.creational.factory.abstracts.os.example.factories.GUIFactory;
import fundamental.design.patterns.creational.factory.abstracts.os.example.factories.MacOSFactory;
import fundamental.design.patterns.creational.factory.abstracts.os.example.factories.WinOSFactory;

public class Demo {


    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WinOSFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
