import java.util.*;


public class App {

    public static void main(String[] args) {

        Heap heap = new Heap(8);
        heap.insert(10);
        System.out.println(heap.getMax());
        heap.insert(-23);
        System.out.println(heap.getMax());
        heap.insert(45);
        System.out.println(heap.getMax());
        heap.insert(26);
        System.out.println(heap.getMax());
        heap.insert(78);
        System.out.println(heap.getMax());
   
    }



} 