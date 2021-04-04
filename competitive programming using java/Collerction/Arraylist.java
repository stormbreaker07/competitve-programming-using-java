import java.util.*;

//arraylist are not syncranized.

public class Arraylist {

    public static void main(String[] args) {

        List<Integer> arry = new ArrayList<Integer>();
        arry.add(34);
        arry.add(48);
        arry.add(50);

        for(Object x : arry)
        {
            System.out.println(x);
        }
        arry.set(1 , 45);


        for(Object x : arry)
        {
            System.out.println(x);
        }

        arry.remove(2);


        for(Object x : arry)
        {
            System.out.println(x);
        }
    }



}