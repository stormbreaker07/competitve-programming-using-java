import java.util.*;

public class Problem1 {

    public static void main(String[] args) {
        Solve solve = new Solve();


    }

}



class Solve {

    private int d1,v1,d2,v2,p;

    Scanner scan = new Scanner(System.in);


    public Solve() {
        int ans=0;
        int vac=0;
        d1 = scan.nextInt();
        v1 = scan.nextInt();
        d2 = scan.nextInt();
        v2 = scan.nextInt();
        p = scan.nextInt();


        for(int i=1; ;i++) 
        {
            if(i>=d1)
            {
                vac+=v1;
            }

            if(i>=d2)
            {
                vac+=v2;
            }


            if(vac>=p)
            {
                ans = i;
                break;
            }
           //System.out.println(i +  " " + vac);
        }

        System.out.println(ans);
    }

}