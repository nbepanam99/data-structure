package fundamental.generics;

import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        IntegerPrinter integerPrinter = new IntegerPrinter(45);
        integerPrinter.printInteger();

        System.out.println(" Using Generic ");
        Cat bob = new Cat();
        bob.setName("Bob");
        bob.setSound("Miaou");
        Printer<Cat> printer= new Printer<>(bob);
        printer.printThing();

        shout(bob.getSound(), "Haaaaaa");

        printList(List.of("Bob", "Tom", "Sam"));

    }

    private static <T, V> T shout(T thing, V otherThing){
        System.out.println(thing + " !!!!! " + otherThing);
        return thing;
    }

    private static void printList(List<Object> myList){
        System.out.println(myList);
    }

}
