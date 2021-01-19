import java.util.*;
import java.lang.*;


public class AlargeDigit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s;
        s = scan.nextLine();
        int a=0 , b=0 ,flag=0;
        for(int i=0;i<s.length();i++)
        {
           // System.out.println(s.charAt(i));
            if(s.charAt(i) == ' ')
            {
             //   System.out.println("ok");
                flag=1;
                continue;
            }
            if(flag == 0)
            {
                a += s.charAt(i)-'0';
            }
            else
            {
                b += s.charAt(i)-'0';
            }
        }
      
        System.out.println(Math.max(a,b));
    
    }

}