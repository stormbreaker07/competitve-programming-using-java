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

        System.out.println("The middle element in the list is " + names.Middle());

    }

}