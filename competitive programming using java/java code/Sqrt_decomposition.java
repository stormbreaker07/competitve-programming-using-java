import java.util.*;
import java.lang.*;

public class Sqrt_decomposition {

public static void main(String[] args) {

    int n ;
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    int[] a = new int[n];

    for(int i=0;i<n;i++)
    {
        a[i] = scan.nextInt();
    }

    int x = (int)Math.sqrt(n);
    int[] block = new int[n];
    int lent;
    if(n%x == 0)
    {
        lent = n;
      
    }
    else
    {
        lent = ((n/x)+1)*x;
        
    }

int j=0;
    for(int i=0;i<n;i++)
    {
        if(i==0)
        {
            block[j] += a[i];
        }
        else
        {
        if(i%x!=0)
        {
            block[j] += a[i];
        }
        else
        {
            j++;
            block[j] += a[i];
        }
        }
    }

    // for(Integer m: block)
    // {
    //     System.out.println(m);
    // }


    System.out.println(query(block , a , x,2 , 5));


}


static int query(int[] block ,int[] a ,int x,   int l , int r)
{
    int sum =0;
    while(l<r && l%x!=0) {
        sum += a[l];
        l++;
    }
    while(l+x <= r)
    {
        sum += block[l/x];
        l+=x; 
    }

    while(l<=r)
    {
        sum += a[l];
        l++; 
    }

    return sum;
}

static bool update(int[] block , int[] a, int x , int ind) {

    if()
}


}