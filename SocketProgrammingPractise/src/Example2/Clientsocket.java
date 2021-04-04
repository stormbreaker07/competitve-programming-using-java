package Example2;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Clientsocket {
    public static void main(String[] args) {
        try {
            Socket Client = new Socket("localhost", 8080);
            InputStream in = Client.getInputStream();
            OutputStream out = Client.getOutputStream();
            String store = "my name is what";

            int c;
            while(true) {
//                System.out.println("previous");
//                while ((c = in.read()) != -1) {
//                    System.out.println("sdjfhsdf");
//                    System.out.println((char) c);
//                }
                Scanner scan = new Scanner(System.in);
                String se = scan.nextLine();
                System.out.println(se);
                byte[] a = se.getBytes(StandardCharsets.UTF_8);
                out.write(a);
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
