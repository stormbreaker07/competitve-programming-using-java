import java.io.PrintStream;

public class Printstreaam {

    public static void main(String[] args) {


        try (
                PrintStream out = new PrintStream("file2.txt") ) {
            out.println("hello printStream user");
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
