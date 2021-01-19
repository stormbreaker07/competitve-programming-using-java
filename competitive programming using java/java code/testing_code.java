import java.util.*;


public class testing_code {


    public static void main(String[] args) {

        int d1,v1,d2,v2,p;

        Scanner scan = new Scanner(System.in);
        d1 = scan.nextInt();
        v1 = scan.nextInt();
        d2 = scan.nextInt();
        v2 = scan.nextInt();
        p = scan.nextInt();

        int val=0;
	for(int i=1; ;i++)
	{
	    if(i>=d1)
	    {
	       val += v1;
	    }
	    
	    if(i>=d2)
	    {
	        val += v2;
	    }
	    
	    if( val >= p )
	    {
	        System.out.println(i);
	        break;
	    }
	}
    }
    
}
