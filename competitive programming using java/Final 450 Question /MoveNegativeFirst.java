
public class MoveNegativeFirst {

    public static void main(String[] args) {

       int a[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6  -1, 2, -3, 4, 5, 6, -7, 8, 9};
        int i=0,j=0;
        int n=a.length;
        for(i=0;i<n;i++) {
            
            if(i>j) {
                j = i;
            }

            if(j>=n-1) {
                break;
            }

            if(a[i] <0) {
                continue;
            }
            else {
                for(int w=j;w<n;w++) {
                    j = w;
                    if(a[w]<0) {
                        
                        int temp = a[i];
                        a[i]= a[w];
                        a[w]= temp; 
                        break;
                    }
                }
                
            }
        }

        for(i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
