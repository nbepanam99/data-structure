package hackerRank.interview.preparation.warm_up;

public class OutMain {

    static final  Integer i1 =1;
    final Integer i2 =2;
    Integer i3 = 3;

    public static void main(String[] args) {

       int c = -1;

       try{
           c = 4/0;
       } catch (Exception e){
           System.out.println(e);
       } finally {
           {
               System.out.println("Finnally ");
           }
           System.out.println(c);
       }

    }
}
