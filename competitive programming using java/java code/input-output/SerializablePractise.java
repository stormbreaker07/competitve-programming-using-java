import java.util.*;
import java.io.*;

public class SerializablePractise {

    public static void main(String[] args) {

        
        try(FileOutputStream x = new FileOutputStream("Cat2");
            ObjectOutputStream out = new ObjectOutputStream(x);) {
            Cat cat1 = new Cat("rekha");
            //System.out.println(cat1);
            out.writeObject(cat1);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        try ( FileInputStream x = new FileInputStream("Cat2");
        ObjectInputStream in = new ObjectInputStream(x);
        ) {
            Cat C = (Cat) in.readObject();
            System.out.println(C);
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    
    }
}


