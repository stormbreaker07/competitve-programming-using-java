import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkList<String> names = new LinkList<>();
        names.insert("Tanuj");
        names.insert("Manu");
        names.insert("Viwaan");
        names.insert("tomcat");
        names.insert("Megha");
        names.insert("java");
        names.insert("mustang gt");


       // names.traverse();
        //names.traverse();

        System.out.println(names.size());
        //names.remove("java");
        //names.remove("mustang gt");
        System.out.println("The middle element in the list is " + names.Middle());
        System.out.println("The Viwaan is present at " + names.Search("Viwaan") + " index");
        System.out.println(names.size());
        names.traverse();

    }

}