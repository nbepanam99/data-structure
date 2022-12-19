package codinggame;

public class FormatText {

    public static void main(String[] args) {
        System.out.println("-- start to format :");
        System.out.println("-- Rules :");
        System.out.println("-- Format a text file using the following rules:\n" +
                "\n" +
                "* Only a single space between words (remove excessive spaces);\n" +
                "* No spaces before punctuation marks;\n" +
                "* One space after each punctuation mark in front of a letter;\n" +
                "* Use only lowercase letters, except for the beginning of the sentence (after a dot);\n" +
                "* Remove repeated punctuation marks.:");

        String input = "";

        System.out.println("-- Result : "+ formatTest(input));
        
        
    }

    private static String formatTest(String input) {

        String result = "";
        return result;
    }

}
