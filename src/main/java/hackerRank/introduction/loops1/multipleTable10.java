package hackerRank.introduction.loops1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multipleTable10 {

    public static void main(String[] args) throws IOException {

        System.out.println("Start now, enter number:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        printMultipleBy10(N);

        bufferedReader.close();
    }

    private static void printMultipleBy10(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }

}
