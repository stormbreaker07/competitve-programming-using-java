import java.util.*;
import java.io.*;

public class example1 {

    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader readin = new BufferedReader(in);

        try {
            String s = readin.readLine();
            System.out.println(s);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
