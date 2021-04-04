package Example1;

import java.net.*;

public class UrlclassPractise {

    public static void main(String[] args) {

       try {

        URL obj = new URL("http://localhost:8080/");


           System.out.println(obj.getProtocol());
           System.out.println(obj.getHost());
           System.out.println(obj.getFile());
           System.out.println(obj.getPort());
           System.out.println(obj.getAuthority());
           System.out.println(obj.getDefaultPort());
           System.out.println(obj.toURI());
       }
       catch(Exception e) {
        e.printStackTrace();
       }
       }

}
