package hackerRank.introduction.loops1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class simpleSerie {

    public static void main(String[] args) throws IOException {

        System.out.println("Start now, enter q number of query and parameter :  a b and n:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = 2; //Integer.parseInt(bufferedReader.readLine().trim());
        int a = 2; //Integer.parseInt(bufferedReader.readLine().trim());
        int b = 2; //Integer.parseInt(bufferedReader.readLine().trim());
        int n = 2; //Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("number of query: " + q);
        System.out.println("a=" + a + ", b=" + b + ", n=" + n);

        List finalResult = new ArrayList<>();
        int[] tab= new int[n];
        int result = 0;
        int j=0;
        while (j<q){
            for (int i = 0; i < n; i++) {

                result += a + 2 ^ i * b;
                tab[i] = result;

            }
            finalResult.add(tab);

            j++;
        }

        for (int l=0; l<finalResult.size(); l++){
            int[] resulttab = (int[]) finalResult.get(l);
            for (int i = 0; i < n; i++) {

                System.out.print(resulttab[i] +" ");
            }
            System.out.println();
        }




        bufferedReader.close();
    }

}
