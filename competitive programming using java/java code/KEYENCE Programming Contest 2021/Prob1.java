import java.util.*;
import java.lang.*;


public class Prob1 {

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        long[] a = new long[n];
        long[] b = new long[n];

        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            b[i] = scan.nextInt();
        }

        for(int i=1;i<n;i++)
        {
            a[i] = Math.max(a[i-1],a[i]);
        }
        
        long[] c = new long[n];
        
        for(int i=0;i<n;i++)
        {
            c[i] = a[i]*b[i];
        }

        for(int i=1;i<n;i++)
        {
            c[i] = Math.max(c[i] , c[i-1]);
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }


    }


}