import java.util.*;


public class Insertion_sort {
    
    
    public static void main(String[] args) {
    int[] x = new int[7];

    x[0] = 2;
    x[1] = 56;
    x[2] = 3;
    x[3] = 67;
    x[4] = 3;
    x[5] = 897;       
    x[6] = 677;
    
    print_array(x);
    System.out.println("=========");
    insertion_sort(x);
    print_array(x);

    }


    public static void insertion_sort(int[] a) {

        int pos=0;
        boolean flag = false;
        for(int i=1;i<a.length;i++)
        { 
            pos = 0;
            flag = false;
            for(int j=i-1;j>=0;j--)
            {
                if(a[j] > a[i])
                {
                    flag = true;
                    pos = j;
                }
            }

            if(flag == true)
            {
            swap(a , i , pos);
            }
        }
    }


    public static void swap(int[] a , int i , int j) {

      int temp1 = a[j];

       for(int ind=i;ind<j;ind++)
       {
            a[ind+1] = a[ind];
       }
       a[i] = temp1;
    }

    public static void print_array(int[] a) {
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
    
        
}
