package Example;

import java.util.ArrayList;
import java.util.TreeSet;

public class Example1 {

    public static void main(String[] args) {
        var set1 = new TreeSet<>();
        ArrayList<Cat> set2 = new ArrayList<Cat>();
        set1.add(new Cat(4));
        set1.add(new Cat(1));
        set1.add(new Cat(5));
        set1.add(new Cat(3));
        set1.add(new Cat(6));

        set1.forEach(x -> System.out.println(x));

    }

}
