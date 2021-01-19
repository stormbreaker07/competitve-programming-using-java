

public class Calculation implements calculator{

    private int x;
    private int y;

public Calculation(int x , int y)
{
this.x = x;
this.y = y;
}

public void addition() {
    System.out.println("you choose to add these two numbers " + (x+y));
}

public void subtraction() {
    System.out.println("you choose to subtract y from x " + (x-y));
}

public void multiplication() {
    System.out.println("you choose to multiply these numbers " + (x*y));
}

public void division() {
    System.out.println("you choose to divide these numbers " + (x/y));
}

}
