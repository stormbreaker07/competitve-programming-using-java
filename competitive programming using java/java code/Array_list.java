import java.util.*;

public class Array_list {

    public static void main(String[] args) {
       // System.out.println("hellow java");
       item_list item = new item_list();
       item.addItem(23);
       item.addItem(45);
       item.addItem(67);
       item.addItem(345);
       item.addItem(7);
       item.printList();
       item.updateItem(2,5665);
       item.printList();
       item.removeItem(1);
       item.printList();
           }



}

class item_list {

    private ArrayList<Integer>  item1 = new ArrayList<Integer>();

    public  void addItem(int num) {
        item1.add(num);
    }

    public  void printList() {
        for(int i=0;i<item1.size();i++)
        {
            System.out.println((i+1) + "th is the element having value " + item1.get(i) );
        }
    }

    public  void updateItem(int pos , int value) {
        item1.set(pos , value);
    }

    public  void removeItem(int pos)
    {
        System.out.println(item1.get(pos));
        item1.remove(pos);
    }



}