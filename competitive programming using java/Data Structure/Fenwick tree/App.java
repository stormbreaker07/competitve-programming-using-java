import java.util.*;

public class App {

   public static void main(String[] args) {
    int[] a = new int[11];
    Scanner scan = new Scanner(System.in);

    for(int i=0;i<11;i++) {
        a[i] = scan.nextInt();
    }

     FenwickTree tree = new FenwickTree(a);
     tree.construct();
     for(int i=1;i<11;i++) {
        System.out.println(tree.Sum(i));      
     }
     
   }
   
}