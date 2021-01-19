import java.util.*;

public class selection_sort {

    public static void main(String[] args) {

        int[] x = new int[7] ;

        x[0] = 2;
        x[1] = 56;
        x[2] = 3;
        x[3] = 67;
        x[4] = 89;
        x[5] = 3;       
        x[6] = 677;
        
        print_array(x);
        System.out.println("==============");
        Selection_sort(x);
        print_array(x);

    } 
    
    public static void Selection_sort(int[] x)
    {
        for(int i=x.length-1;i>0;i--)
        {
            int largest = 0;
            for(int j=1;j<=i;j++)
            {
                if(x[j] > x[largest])
                {
                    largest = j;
                }
            }
            swap(x , i , largest);
        }
    }


    public static void swap(int[] a ,int i ,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void print_array(int[] x) {
        
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }

    }



}