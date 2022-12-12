package fundamental.design.patterns.behavior.strategy2;

import java.util.List;
import java.util.function.Predicate;

public class Sample {
    public static void main(String[] args) {
        // we have collection of number ,price, stock, prod ..
        // We ask to write a method to total all values
        // Strategies are often a single method or function.
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7,8);

        System.out.println(totalValues(numbers, ignore -> true ));
        System.out.println(totalValues(numbers, number -> number % 2 == 0));
        System.out.println(totalValues(numbers, number -> number % 2 != 0 ));
        //System.out.println(totalEvenValues(numbers));
        //System.out.println(totalOddValues(numbers));
    }

    public static int totalValues(List<Integer> integers, Predicate<Integer> selector) {
        int total = 0;
        /*for (var number: integers){
            if (selector.test(number)) {
                total += number;
            }
        }*/

        total = integers.stream()
                .filter(selector)
                .mapToInt(integer -> integer)
                .sum();
        return total;
    }

    @Deprecated
    public static int totalEvenValues(List<Integer> integers) {
        int total = 0;
        for (var number: integers){
            if (number%2 == 0) {
                total += number;
            }
        }
        return total;
    }

    @Deprecated
    public static int totalOddValues(List<Integer> integers) {
        int total = 0;
        for (var number: integers){
            if (number%2 != 0) {
                total += number;
            }
        }
        return total;
    }


}
