import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writerclass {

    public static void main(String[] args) {

        try (
        FileWriter w = new FileWriter("file.txt");
        BufferedWriter out = new BufferedWriter(w)
        ) {
            out.write("hello world");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
