import java.util.*;


public class Codeforces2 {

    public static void main(String[] args) {

        int t;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        scan.nextLine();
        while(t>0)
        {
            String s1 ,s2;
            s1 = scan.nextLine();
            s2 = scan.nextLine();
            int flag=0;
          //  System.out.println(s1 + " " + s2);
          String n1 , n2,ans="";
            for(int i=1;i<=20;i++)
            {
                for(int j=1;j<=20;j++)
                {
                    n1 = s1.repeat(i);
                    n2 = s2.repeat(j);
                    if(n1.equals(n2))
                    {
                        if(n1.length() < ans.length() || ans.length()==0)
                        {ans = n1;
                        flag=1;}
                    }
                }
            }
            if(flag==1)
            {System.out.println(ans);
            }
            else
            {
                System.out.println("-1");
            }
            t--;
        }
        
    }

}