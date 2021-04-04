package Example1;

import java.net.*;
import java.io.*;


public class UrlconnectionclassPractise {


    public static void main(String[] args){
        try{
            URL url=new URL("https://stormbreaker07.github.io/index.html");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            while((i=stream.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){System.out.println(e);}
    }
}
