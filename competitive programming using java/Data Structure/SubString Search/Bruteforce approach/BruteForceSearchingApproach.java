import java.util.*;

public class BruteForceSearchingApproach {

    public static void main(String[] args) {

        String s ;
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        String sub;
        sub = scan.nextLine();
        int pos = BruteForce(s , sub);
        System.out.println(pos);
    }

    public static int BruteForce(String s , String sub) {
        //take two pointer i , j
        //i for s j for sub
        //if
        
        int temp1 , pos = -1;
        Boolean isMatched = false; 
        for(int i=0;i<s.length();i++) {
            isMatched = true;
            temp1 = i;
            for(int j=0;j<sub.length();j++) { 
                if(s.charAt(temp1) != sub.charAt(j)) {
                    isMatched = false;
                    break;
                }
                else {
                    temp1++;
                }
            }
            if(isMatched) {
                pos = i;
                return pos;
            }
        }
        return pos;
    }
}
