import java.util.*;

public class PairWithGIvenSum {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n,k;
        n = scan.nextInt();
        k = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        Solution solution = new Solution();
        int count = solution.getPairsCount(a, n, k);
        System.out.println(count);
    }
}

class Solution {
    int getPairsCount(int[] a, int n, int k) {
         Arrays.sort(a);
        
        int[] rp = new int[1000000];
        for(int i=0;i<n;i++) {
           // System.out.println(i + " " + a[i]);
            rp[a[i]]++;
        }
        
        
        int i=0;
        int j = n-1;
        int count = 0;
        while(i<j) {
        
            if(a[i] +a[j] > k) {
                j--;
            }
            else if(a[i]+a[j] < k) {
                i++;
            }
            else {
                
                //System.out.println(a[i] + " " + a[j]);
                int temp = 0;
                if(a[i]!= a[j]) {
                    int x1 = Math.max(rp[a[i]],rp[a[j]]);
                    int x2 = Math.min(rp[a[i]],rp[a[j]]);
                    temp = x1*x2;
                    rp[a[i]] = 0;
                    rp[a[j]] = 0;
                }
                else {
                    int x = rp[a[i]];
                    temp = (x*(x-1))/2;
                    rp[a[i]] = 0;
                }
                 //System.out.println("the value of temp is " + temp);
                count+=temp;
                i++;
                j--;
            }
        }  
        return count;
    }
}
