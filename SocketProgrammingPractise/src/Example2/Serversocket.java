package Example2;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Serversocket {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(8080);
            Socket ss = server.accept();
            InputStream in = ss.getInputStream();
            OutputStream out = ss.getOutputStream();
            int c;
            while(true) {
                while ((c = in.read()) != -1) {
                    System.out.print((char) c);
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
