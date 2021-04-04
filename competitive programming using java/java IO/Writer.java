import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) {

        try (Writer w = new FileWriter("test1.txt");
        BufferedWriter out = new BufferedWriter(w)) {
     out.write("Hello world!");
   } catch (IOException e) {
     e.printStackTrace();
   }
    }
    
}
