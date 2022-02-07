package hackerRank.interview.preparation.warm_up;

public class ValueKMain {

    static final  Integer i1 =1;
    final Integer i2 =2;
    Integer i3 = 3;

    public static void main(String[] args) {

     int i =6, J=4, k=9;
     test(6,4,9);
        System.out.println(k);

    }

    private static void test(int i, int i1, int i2) {
        if(i==5){
            i2=i1;
        }
        else {
            i2=i;
        }
    }
}
