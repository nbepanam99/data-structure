package codinggame;

public class SumDoubleString {


    public static void main(String[] args) {

        String firstNumber= "9.34";
        String secondNumber= "1.34";

        solution(firstNumber, secondNumber);
    }

    private static void solution(String firstNumber, String secondNumber) {
        double result = Double.valueOf(firstNumber) + Double.valueOf(secondNumber);
        System.out.println("Result = " + result);

    }
}
