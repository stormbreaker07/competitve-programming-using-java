import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int[] array_int = set_array(n);
         //get_array(array_int);
         int[] sorted_array = sorted(array_int);
        get_array(sorted_array);

    }

    public static int[] set_array(int n) {
        int[] array1 = new int[n];
        for(int i=0;i<n;i++)
        {
            array1[i] = scanner.nextInt();
        }
        return array1;
    }


    public static void get_array(int[] array1) {
        for(int i=0;i<array1.length;i++)
        {
            System.out.println("the " + i + "element in the array is " + array1[i]);
        }
    }

    public static int[] sorted(int[] array1) {

        int[] sorted_ar = new int[array1.length];

        for(int i=0;i<array1.length;i++)
        {
            sorted_ar[i] = array1[i];
        }

        int temp;

        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array1.length;j++)
            {
                if(sorted_ar[i] > sorted_ar[j])
                {
                   temp = sorted_ar[i];
                   sorted_ar[i] = sorted_ar[j];
                   sorted_ar[j] = temp;
                }
            }
        }

        return sorted_ar;
    }




//    public static void set_array(int[] Array) {
//        for(int i=0;i<Array.length;i++) {
//            Array[i] = scanner.nextInt();
//        }
//    }
//
//    public static void get_array(int[] Array) {
//        for(int i=0;i<Array.length;i++)
//        {
//            System.out.println( i + " index contain "  + Array[i] + " value");
//        }
//    }
//
//    public static int get_average(int[] Array) {
//        int average =0;
//        for (int i = 0; i < Array.length; i++)
//        {
//            average += Array[i];
//        }
//
//        return average/Array.length;
//
//    }

}
