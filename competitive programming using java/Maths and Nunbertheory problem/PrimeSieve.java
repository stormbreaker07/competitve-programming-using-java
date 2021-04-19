import java.util.*;

public class PrimeSieve {

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++) {
            arr[i] = i;
        }

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(i!=2 && i%2==0)
            {
                continue;
            }

            for(int j=2*i;j<=n;j+=i) {
                arr[j] = -1;
            }
        }

        for(int i=1;i<=n;i++) {
            if(arr[i] !=-1)
            {
                System.out.print(arr[i] + " ");
            }
        }

    }
}