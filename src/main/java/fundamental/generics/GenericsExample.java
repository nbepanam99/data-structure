package fundamental.generics;

public class GenericsExample {

    public static void main(String[] args) {

        IntegerPrinter integerPrinter = new IntegerPrinter(45);
        integerPrinter.printInteger();


        System.out.println(" Using Generic ");
        Printer<Integer> printer= new Printer<>(67);
        printer.printThing();

    }

}
