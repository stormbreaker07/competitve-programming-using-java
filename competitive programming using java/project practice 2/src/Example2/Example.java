package Example2;

import java.util.*;


public class Example {
    public static void main(String[] args) {

        Comparator<Dog> c = (d1,d2) -> d1.getAge()-d2.getAge();

        var set = new TreeSet<Dog>(c);

        set.add(new Dog("A" , 3));
        set.add(new Dog("D" , 2));
        set.add(new Dog("C" , 1));
        set.add(new Dog("A" , 3));

        set.forEach(System.out::println);

    }
}
