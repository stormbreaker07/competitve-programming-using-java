package tree_data_structure;

import java.util.*;


public class DisjointSetUnion {

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] a = new int[n];

        initialize(a);

        int operation,x,y ;
        operation = scan.nextInt();

        for(int i=0;i<operation;i++)
        {
            x = scan.nextInt();
            y = scan.nextInt();
            int result = find(x,y ,a );
            System.out.println(result);
        }
    }

    static void initialize(int[] a) {
        for(int i=0;i<a.length;i++) {
            a[i] = i;
        }
    }

    static int find(int x , int y , int[] a) {
        if(a[x] == a[y])
        {
            return 1;
        }
        else
        {
            union(x ,y,a);
        return 2;
        }
    }

    static void union(int x , int y , int[] a) {

        int temp = a[x];
        for(int i=0;i<a.length; i++)
        {
            if(a[i] == temp)
            {
                a[i] = a[y];
            }
        }
    }

}
