import java.util.*;

public class CTheChildandToy {

    public static void main(String[] args) {
        int n, m;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            a[i] = scan.nextInt();
        }
        int ans = 0,x,y;
        for(int i=0;i<m;i++)
        {
            x = scan.nextInt();
            y = scan.nextInt();
        ans += Math.min(a[x] , a[y]);
        }
        System.out.println(ans);
    }
}