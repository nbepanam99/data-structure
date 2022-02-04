package hackerRank.interview.preparation.warm_up.if_then_elese;

import java.util.Scanner;

/**
 * Task
 * Given an integer,
 *
 * , perform the following conditional actions:
 *
 *     If
 *
 * is odd, print Weird
 * If
 * is even and in the inclusive range of to
 * , print Not Weird
 * If
 * is even and in the inclusive range of to
 * , print Weird
 * If
 * is even and greater than
 *
 *     , print Not Weird
 *
 * Complete the stub code provided in your editor to print whether or not
 * is weird.
 */
public class Practice1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myInt1 = scanner.nextInt();
        scanner.close();

        if (!((myInt1 % 2) == 0)) {
            // odd
            System.out.println("Weird");
        } else {
            // even
            if (myInt1>=2 && myInt1 <=5){
                System.out.println("Not Weird");
            }
            if (myInt1>=6 && myInt1 <=20){
                System.out.println("Weird");
            }
            if (myInt1>20){
                System.out.println("Not Weird");
            }

        }



    }

}
