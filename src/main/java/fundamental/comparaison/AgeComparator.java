package fundamental.comparaison;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        if (user1.getAge() < user2.getAge()){
            return -1;
        } else {
            return 1;
        }

        // we can do : return user1.getAge() - user2.getAge()

    }

}
