package codinggame;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormatTextTest {
    /*
    Format a text file using the following rules:

    * 1 : Only a single space between words (remove excessive spaces);
    * 2 : No spaces before punctuation marks;
    * 3 : One space after each punctuation mark in front of a letter;
    * 4 : Use only lowercase letters, except for the beginning of the sentence (after a dot);
    * 5 : Remove repeated punctuation marks.

     */
    @Test
    public void mustCheckIfNoSpace() {

        var input = "hello world   ,   how    are  you ? I good.And you ? ";
        var result = "hello world";
        System.out.println(" start ");
        String replace1 = input.replaceAll("\\s+", " ");
        System.out.println(" 1 : "+replace1);
        String replace2 = replace1.replaceAll("\\s+(?=\\p{Punct})", "");
        System.out.println(" 2 : "+replace2);
        String replace3 = replace2.replaceAll("\\p{Punct}+", "$0 ");
        System.out.println(" 3 : "+replace3);
        String replace4 = replace3.replaceAll("\\s+", " ");
        System.out.println(" 4 : "+replace4);

        System.out.println("-- result");




    }


}