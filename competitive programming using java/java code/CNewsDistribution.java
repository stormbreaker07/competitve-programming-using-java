import java.util.*;

public class CNewsDistribution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n,m;
        n = scan.nextInt();
        m = scan.nextInt();
        int a[] = new int[n+1];
        int siz[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            a[i] = i;
            siz[i] = 1;
        }

        for(int i=0;i<m;i++)
        {
            int x;
            x = scan.nextInt();
            int temp[] = new int[x];
            for(int j=0;j<x;j++)
            {
                temp[j] = scan.nextInt(); 
            }
            
            for(int j=0;j<x-1;j++)
            {
                int s1,s2;
                s1 = temp[j];
                s2 = temp[j+1];
                union(a , siz , s1 ,s2);
            }

        }

        for(int i=1;i<=n;i++)
        {
            int x = root(a[i] , a);
            siz[i] = siz[x];
        }

        for(int i=1;i<=n;i++)
        {
            System.out.print(siz[i] + " ");
        }
    
    }



        static int root(int x , int a[])
        {
            while(a[x] != x)
            {
                a[x] = a[a[x]];
                x = a[x]; 
            }
            return x;
        }

        static void union(int a[] , int siz[] , int s1 , int s2)
        {
            int root_x = root(s1 , a);
            int root_y = root(s2 , a);
            if(siz[root_x] >= siz[root_y])
            {
                siz[root_x] += siz[root_y];
                a[root_y] = a[root_x];
            }
            else
            {
                siz[root_y] += siz[root_x];
                a[root_x] = a[root_y];
            }
        }

        
    }