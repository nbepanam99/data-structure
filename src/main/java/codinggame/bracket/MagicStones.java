package codinggame.bracket;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicStones {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Set stoneBag= new HashSet();

        int[] levels = {1,2,9,3,5,1};

        for (int i = 0; i < levels.length; i++) {
            int level = levels[i];
            System.out.println("- level " + level);

            addOrMerge(stoneBag, level);

        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


        System.out.println("Result size : " +stoneBag.size());
        stoneBag.forEach(System.out::println);
    }

    private static void addOrMerge(Set stoneBag, int level) {
        if (stoneBag.contains(level)){
            stoneBag.remove(level);
            addOrMerge(stoneBag,level+1);
        } else {
            stoneBag.add(level);
        }
    }
}
