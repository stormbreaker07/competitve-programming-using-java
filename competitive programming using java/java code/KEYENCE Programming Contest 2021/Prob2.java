import java.util.*;

public class Prob2 {

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        
        int[] a = new int[n+1];
        
        for(int i=0;i<n;i++)
        {
            x = scan.nextInt();
            a[x] += 1;
        }

        for(int i=0;i<n;i++)
        {
            if(a[i] == 0)
            {
                ans += a[i];
                break;
            }
        }

        for(int i=n;i>=0;i--)
        {
            
        }
    }
}