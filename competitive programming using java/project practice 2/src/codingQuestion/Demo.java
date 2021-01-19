package codingQuestion;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<>();

        x.add(10);
        x.add(30);
        x.add(56);
        x.add(76);
        x.add(223);

      //  System.out.println(x.get(3));

//        for(int i=0;i<x.size();i++)
//        {
//            System.out.println(x.get(i));
//        }

//        for(Integer a : x)
//        {
//            System.out.println(a);
//        }


//from java 8
      //  x.forEach(a -> System.out.println(a));


        x.remove(3);

        x.forEach(a -> System.out.println(a));


    }
}
