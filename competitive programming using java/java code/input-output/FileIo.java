import java.util.*;
import java.io.*;

public class FileIo {

    public static void main(String[] args) {

       
        // try ( Writer w = new FileWriter("newfile.txt");
        // BufferedWriter out = new BufferedWriter(w);) {
        //     out.write("new file created");
        // }
        // catch(IOException e) {
        //     e.printStackTrace();
        // }
    

        // try 
        // {
        //     InputStreamReader x = new InputStreamReader(new FileInputStream("newfile.txt"));
        //     BufferedReader y = new BufferedReader(x);    
        //     String line;
        //     String s = null;
        //     while((line = y.readLine())!=null)
        //     {
        //        s += line;
        //        s += " \n"; 
        //     }
        //     System.out.println(s);
        // }
        // catch(IOException e) {
        //     e.printStackTrace();
        // }


        // try{
        //     PrintStream out = new PrintStream("newFile3.txt");
        // out.println("it is the second file but name as third one");
        // }
        // catch(FileNotFoundException e) {
        //     e.printStackTrace();
        // }
    
        try {
            PrintWriter out = new  PrintWriter(new FileOutputStream("newfile3.txt"));    
            out.println("hello friends");
            out.flush();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}