import java.util.*;

public class TypeException {

    public static void main(String[] args) {
        int x;
        x = getInput();
        System.out.println(x);
    }

    public static int getInput() {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        boolean valid = true;
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                valid = false;
                break;
            }
           
        }
        if(valid == false)
         {
             return 0;
         }
         else
         {
             return Integer.parseInt(s);
         }
    }

    public static int getInputLLb() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        try {
            return Integer.parseInt(s);
        } 
        catch(InputMismatchException e) {
            return 0;   
        }
    }

}
