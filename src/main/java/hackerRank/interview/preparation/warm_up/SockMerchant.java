package hackerRank.interview.preparation.warm_up;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class SockMerchant {

    public static void main(String[] args) throws IOException {

        int n = 9;

        List<Integer> ar = Arrays.asList(10,20,20,10,10,30,50,10,20);

        int result = SockMerchant.sockMerchant(n, ar);

        System.out.println("-- nb : " + n);
        System.out.println("-- sock : " + ar);
        System.out.println("-- nb of pair :" + result);
    }

    private static int sockMerchant(int n, List<Integer> integerList) {
        int result=0;

        Set set =new HashSet();

        for (Integer integer:integerList){
            set.add(integer);
        }

        System.out.println("-- Different Sock " + set);

        Map<Integer, Long> counted = integerList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(counted);
        for (Map.Entry<Integer, Long> entry : counted.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
            if (entry.getValue()>1){
                long temp = entry.getValue() / 2;
                result+=Integer.parseInt(String.valueOf(temp));
            }
        }

        return result;
    }


}
