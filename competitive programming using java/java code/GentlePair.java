import java.util.*;
import java.lang.*;

public class GentlePair {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[][] a = new int[n][2];
        
        for(int i=0;i<n;i++)
        {
            a[i][0] = scan.nextInt();
            a[i][1] = scan.nextInt();
        }
        int ans =0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i!=j)
                {
                    double y = (double)(a[j][1] - a[i][1]);
                    double x = (double)(a[j][0] - a[i][0]);
                    double temp = y/x;
                   // System.out.println(temp);
                    if(temp>=-1 && temp<=1)
                    {ans++;}
                }
            }
        }
        System.out.println(ans);

    }



}