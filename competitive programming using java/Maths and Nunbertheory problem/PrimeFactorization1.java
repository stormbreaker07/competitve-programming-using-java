import java.util.*;

class pair {
    int count=0;
    int factor;
    
    public pair() {
        this.count=0;
        this.factor=0;
    }

    public pair(int count , int factor) {
        this.count = count;
        this.factor = factor;
    }
}


public class PrimeFactorization1 {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        
        List<pair> factors = new ArrayList<>();
        
        for(int i=2;i*i<=n;i++) {
            
            int count=0;
            if(n%i==0) {
                while(n%i==0) {
                    count++;
                    n = n/i;
                }
                factors.add(new pair(count , i));
                count=0;
            }
        }
        if(n!=1) {
            factors.add(new pair(1 , n));
        }


        for(pair x: factors) {
            System.out.println(x.factor + "^" + x.count);
        }

    }
}