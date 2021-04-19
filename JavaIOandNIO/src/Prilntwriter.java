import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Prilntwriter {

    public static void main(String[] args) {


        try (PrintWriter out = new PrintWriter(new FileOutputStream("PrintWriter.txt")) ){
            out.println("hello PrintWriter user !");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
