package hackerRank.interview.preparation.warm_up;

public class ExceptionMain {

    static final  Integer i1 =1;
    final Integer i2 =2;
    Integer i3 = 3;

    public static void main(String[] args) {

        /*
        * print B and D
        * */
       try{
           throw  new RuntimeException();
       } catch (Throwable e){
           System.out.println("B");


       }finally {
           System.out.println("D");
           return;
       }

    }
}
