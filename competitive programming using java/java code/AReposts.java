import java.util.*;

public class AReposts {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        Map<String , Integer> map = new HashMap<>();
        int ans =0;
        map.put("polycarp" , 1);
        for(int i=0;i<n;i++)
        {
            String a = scan.next().toLowerCase();
            String d = scan.next();
            String b = scan.next().toLowerCase();
            map.put(a , map.get(b) + 1);
            ans = Math.max(ans , map.get(a));
        }
        System.out.println(ans);
    }
}