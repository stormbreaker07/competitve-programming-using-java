import java.util.*;

public class RabinKarl {

    public long[] hash;
    public long P=31;
    public long M = 100000007;

    public static void main(String[] args) {
        String s,sub;
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        sub = scan.nextLine();

        hash = new long[s.length()+1];
        
       long cal=0;
        for(int i =0;i<sub.length();i++) {
            cal += ((s.charAt(i)-'a')+1) + Math.pow(p , i);
        }
        hash[i] = cal;        
        hashValue(hash , s , sub.length());

        cal = 0;
        long subHash;
        for(int i =0;i<sub.length();i++) {
            cal += ((s.charAt(i)-'a')+1) + Math.pow(p , i);
        }
        subHash = cal % M;
        for(int i=0;i<s.length();i++) {
            if(subHash == hash[i]) {
                System.out.println("the index of the substring is " +i);
            } 
        }
    }

    public static void hashValue(int[] hash , String s , int len) {

        int j = len;
        for(int i=1;i<s.length();i++) {
            if(j>=s.length() ) {break;}
            hash[i] = hash[i-1] - ((s.charAt(i-1)-'a')+1);
            hash[i]/= p;
            hash[i] += ((s.charAt(j)-'a')+1) + Math.pow(p , len-1);
            j++;
        }    
    }
}