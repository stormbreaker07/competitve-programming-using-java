import java.util.*;

class Check {


    public <T> T genericMethod(T t) {
        System.out.println("the item is " + t.toString());
        return t;
    }


}



public class Generic_Method {

    public static void main(String[] args) {

        Check check = new Check();
        System.out.println(check.genericMethod("hello world"));
        
    }

}