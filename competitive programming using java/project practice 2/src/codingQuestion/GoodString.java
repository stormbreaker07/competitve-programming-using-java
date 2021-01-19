package codingQuestion;
import java.util.*;
import java.lang.String;

public class GoodString {

        static Set<Long> set = new HashSet<>();
        static int k;
        static long[] p_pow = new long[2000];
        public static void main(String[] args) {
                String s,a;
                Scanner scan = new Scanner(System.in);
                s = scan.nextLine();
                a = scan.nextLine();
                k = scan.nextInt();
                long[] hash_array = calculate_hash_prefix(s);
                int[] record = calculate_good(s , a);
                calculate_substring(s , hash_array , record);
                System.out.println(set.size());
        }

        static long[] calculate_hash_prefix(String s) {
                int n = s.length();

                int p = 31;
                long  m = 1000000009;
                long[] hash = new long[n];
                p_pow[0] = 1;
                for (int i = 1; i < n; i++)
                        p_pow[i] = (p_pow[i-1] * p) % m;

                for (int i = 0; i < n; i++) {
                        if(i==0)
                        {
                                hash[i] = ((s.charAt(i) - 'a' + 1)*p_pow[i])%m;
                        }
                        else {
                                hash[i] = (hash[i-1] + (s.charAt(i) - 'a' + 1) * p_pow[i]) % m;
                        }
                }
                return hash;
        }


        static void calculate_substring(String s ,long[] hash , int[] record) {
                for (int len = 1; len <= s.length(); len++)
                {
                        // Pick ending point
                        for (int i = 0; i <= s.length() - len; i++)
                        {
                                int j = i + len - 1;
                                //System.out.println(i + " " + j);
                               if(i==0)
                               {
                                       if(record[j] <= k)
                                       {set.add(hash[j]);}
                               }
                               else
                               {
                                       if(record[j]-record[i-1] <= k)
                                       {long w = (hash[j] - hash[i-1])%1000000009;
                                       long x = (p_pow[i])%1000000009;
                                               set.add(w/x);}
                               }
                       }
               }
        }

        static int[] calculate_good(String s , String a ) {
                //System.out.println(s);
                int[] temp = new int[s.length()];
                for(int i=0;i<s.length();i++)
                {
                        //System.out.println(s.charAt(i) -'a');
                        if(a.charAt(s.charAt(i) -'a') == '0') {
                                //System.out.println(s);
                                temp[i] += 1;
                        }
                }
                for(int i=1;i<s.length();i++)
                {
                        temp[i] += temp[i-1];
                }
                return temp;
        }


//        static long calculate_hash(String s) {
//
//                int p = 31;
//                int m = 1000000009;
//                long hash=0;
//                long pow = 1;
//                for(int i=0;i<s.length();i++)
//                {
//                        hash = (hash + (s.charAt(i) - 'a' + 1)*pow )%m;
//                        pow = (pow * p)%m;
//                }
//                return hash;
//        }

}