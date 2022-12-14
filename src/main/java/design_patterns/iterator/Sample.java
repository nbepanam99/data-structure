package design_patterns.iterator;

import java.util.List;

public class Sample {

    public static void main(String[] args) {
        System.out.println("-- Start iterator pattern");
        var names = List.of("Dory", "Bob", "Alex", "Ali", "Li", "Martin");

        for (var name: names){
            if (name.length() == 4){
                System.out.println(name.toUpperCase());
            }
        }

        // or
        System.out.println("-- Second method");

        names.stream()
                .filter(s -> s.length() == 4)
                .map(s -> s.toString())
                .forEach(System.out::println  );

    }
}
