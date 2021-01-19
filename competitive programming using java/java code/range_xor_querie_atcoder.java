import java.util.*;


public class range_xor_querie_atcoder {
    
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int n,q;
        n = scan.nextInt();
        q = scan.nextInt();

        int[] a = new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]  = scan.nextInt();
        }
  
        int[] dp = rangeXor(a , n );
        
        int t,x,y;

        for(int i=0;i<q;i++)
        {
            t = scan.nextInt();
            x = scan.nextInt();
            y = scan.nextInt();
            if(t==1)
            {
                System.out.println(a[x-1]^y);
            }
            else
            {
                x--;
                y--;
                if(x>0)
                {
                    int w = dp[y]^dp[x-1];
                    System.out.println(w);
                }
                else
                {
                    int w = dp[y];
                    System.out.println(w);
                }
            }
        }

   

        scan.close();
    }


    public static int[] rangeXor(int[] a , int n) {

        int[]  dp = new int[n];
        dp[0] = a[0];
        for(int i=0;i<n;i++)
        {
            dp[i] = dp[i-1]^a[i];
        }

        return dp;
    }

    
    
}
