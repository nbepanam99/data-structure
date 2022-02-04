package fundamental.comparaison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Anna");
        names.add("Zaza");
        names.add("Teo");

        List<User> users = new ArrayList<>();
        users.add(new User("Bob", 12));
        users.add(new User("Anna", 8));
        users.add(new User("Zaz", 9));
        users.add(new User("Teo", 11));


        System.out.println("-- Given by name");
        for (User user: users){
            System.out.println("-- name : " +user.getName() + ", age : " + user.getAge());
        }

        System.out.println("-- Sort by Age");

        Collections.sort(users, new AgeComparator());
        for (User user: users){
            System.out.println("-- name : " +user.getName() + ", age : " + user.getAge());
        }


    }

}
