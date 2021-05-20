import java.util.*;

public class KnuthMoris {

    public int[] pi;
    public String s;
    public String sub;
    
    public KnuthMoris(String s , String sub) {
        this.s = s;
        this.sub = sub;
        this.pi = new int[s.length()];

    }



    public void contructTable() {
        
        int counter = 0;
        int i = 1;
        
        while(i<sub.length()) {
            if(sub.charAt(i) == sub.charAt(counter)) {
                counter += 1;
                pi[i] = counter;
                i += 1;
            }
            else {
                if(counter != 0 ) {
                    counter = pi[counter-1];
                }
                else {
                    pi[i] = 0;
                    i+=1;
                }
            }
        }
    }




    public void search() {

        contructTable();
        int i=0,j=0;

        while(i<s.length() && j<sub.length()) {

            if(s.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            }

            if(j == sub.length()) {
                System.out.println(i-j);
                j = pi[j-1];
            }

            if(i<s.length() && s.charAt(i) != sub.charAt(j)) {
    		
            	if(j!=0) 
    				j = pi[j-1];
    			else
    				i++;
    		}

         }
    }

}