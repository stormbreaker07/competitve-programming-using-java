import java.util.*;

public class App {

    public static void main(String[] args) {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    
    tree.insert(34);
    tree.insert(65);
    tree.insert(12);
    tree.insert(345);
    tree.insert(86);
    tree.insert(22);
   
   tree.in_order();
   try {
   System.out.println(" ");     
   System.out.println(tree.getMax());
   System.out.println(tree.getMin());
   }catch(Exception e) {
       System.out.println(e);
   }
    }
}