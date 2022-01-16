import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FirstTest {

    record Diamond(String name){}

    @Test
    void shouldAddNumbers() {
        System.out.println("-- OK");
    }

    @Test
    void usingHashMap() {

        Map<Person,Diamond> personDiamondHashMap =new HashMap<>();

        personDiamondHashMap.put(new Person("Tom"), new Diamond("Nord"));

        // Here we use the Hash Code
        System.out.println("get Tom from : " +personDiamondHashMap.get(new Person("Tom")));

        // 2 different object but same hashcode
        System.out.println(new Person("Christopher").hashCode());
        System.out.println(new Person("Christopher").hashCode());




    }

    @Test
    void useMaps() {
        simpleMapsTips();
    }

    private void simpleMapsTips() {
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



    class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

}
