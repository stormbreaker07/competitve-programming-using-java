import java.util.*;

// Linkedlist are also not syncrnized

public class Linkedlist {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();
        list.add(12);
        list.add(45);
        list.add(10);
        list.add(56);

        for(Integer x : list) {
            System.out.println(x);
        }

        list.remove(0);

       // System.out.println(list.getFirst());
        //System.out.println(list.getLast());

    }


}