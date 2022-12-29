package fundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndHashSet {


    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();

        strings.add("Bob");
        strings.add("Karl");
        strings.add("Regis");
        strings.add("Sarah");
        strings.add("Noemi");

        System.out.println(strings);

        System.out.println("-- With Lambda");
        strings.forEach(System.out::println);

        Iterator<String> iterator = strings.iterator();
        System.out.println("-- With iterator");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
