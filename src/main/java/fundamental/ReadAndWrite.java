package fundamental;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWrite {

    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello World");
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            System.out.println(reader.readLine());
            reader.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
