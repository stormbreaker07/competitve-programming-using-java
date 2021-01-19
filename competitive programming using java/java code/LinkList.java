import java.util.*;



public class LinkList {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("storm");
        list.add("breaker");
        list.add("007");

        print_list(list);

    }


    public static void print_list(LinkedList<String> list) {

        Iterator i = list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        } 

    }
}
