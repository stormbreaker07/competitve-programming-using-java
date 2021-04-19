import java.io.*;

public class Filereader {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("file.txt")
                )
        )) {

            String l;
            while((l = in.readLine()) != null)
            {
                System.out.println(l);
            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
