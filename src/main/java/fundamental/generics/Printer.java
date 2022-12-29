package fundamental.generics;

public class Printer <T> {

    T thingToPrint;

    public Printer(T thingToPrint) {
        
        this.thingToPrint = thingToPrint;
    }

    public void printThing() {
        System.out.println(thingToPrint);
    }



}
