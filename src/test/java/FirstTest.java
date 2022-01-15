import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class FirstTest {

    record Person(String name, int age) {}

    @Test
    void shouldAddNumbers() {
        System.out.println("-- OK");
    }

    @Test
    void usingHashMap() {

        Map<Integer, String > map = new HashMap<>();

        map.put(1, "Tom");
        map.put(2, "Alex");
        map.put(3, "Bob");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet().forEach(x -> System.out.println(x.getKey()+" : " +x.getValue()));

        map.forEach((i, s) -> {
            System.out.println(i+" : " +s);
        });

        System.out.println(map.getOrDefault(4, "Default"));

        System.out.println(map.values());


    }

}
