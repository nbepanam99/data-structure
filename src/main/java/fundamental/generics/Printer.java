package fundamental.generics;

import java.io.Serializable;

public class Printer <T extends Animal & Serializable> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        
        this.thingToPrint = thingToPrint;
    }

    public void printThing() {
        System.out.println(thingToPrint);
    }



}
