import java.util.*;

public class ThrowPractise {

    public static void main(String[] args) {
        System.out.println(divide());
    }

    public static int  divide() {
        int a , b;
        a = getInput();
        b = getInput();
        System.out.println("a is : " + a + " and b is : " + b);
        try {
            return a/b;
        }
        catch(ArithmeticException e) {
            throw new ArithmeticException("attempt to divide a number by 0");
        }
    }

    public static int getInput() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        while(true)
        {
            try {
            return Integer.parseInt(s);
        } 
        catch(InputMismatchException e) {
            System.out.println("please input a valid integer");
        }
        }
    }
}