import java.util.*;

public class CommonElement {
    
    public static void  main(String[] args) {
        
        int n1,n2,n3;
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n3];
        
        for(int i=0;i<n1;i++) {
            a[i] = scan.nextInt();
        }
        for(int i=0;i<n2;i++) {
            b[i] = scan.nextInt();
        }
        for(int i=0;i<n3;i++) {
            c[i] = scan.nextInt();
        }

         Solution1 solution = new Solution1();
        ArrayList<Integer> list = solution.commonElements(a, b, c, n1, n2, n3);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    scan.close();
    }
}


class Solution1 {
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        int i=0,j=0,k=0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i<n1 && j<n2 && k<n3) {
            int min = Math.max(Math.max(a[i] , b[j]),c[k]);
            if(a[i]==min && b[j]==min && c[k]==min ) {
                list.add(min);
                i++;
                j++;
                k++;
                continue;
            }
            
            
            if(a[i] < min) {
                i++;
            }
            
            if(b[j] < min) {
                j++;
            }
            
            if(c[k] < min) {
                k++;
            }
           // System.out.println(i + " " + j + " " + k);
        }
        return list;
    }
}
