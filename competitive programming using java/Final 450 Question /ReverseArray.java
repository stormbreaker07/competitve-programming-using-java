
public class ReverseArray {

    public static void main(String[] args) {

        String s = "sfsdfsadf";
        //Scanner scan = new Scanner(System.in);
        //s = scan.nextLine();
        System.out.println(ReverseString.reverse(s));

    }

}

class ReverseString {

    private ReverseString() {}

    public static String reverse(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}