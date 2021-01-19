import java.util.*;

public class bubble_sort {

    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(2);
        x.add(4);
        x.add(76);
        x.add(34);
        x.add(89);
        x.add(4);
        x.add(7);
        print_array(x);
        System.out.println("===================");
        Bubble_sort(x);
        print_array(x);

    }

    public static void Bubble_sort(ArrayList<Integer> x) {
        
        int temp,s1,s2;
        for(int i=0;i<x.size()-1;i++)
        {
            s1 = i;
            s2 =i+1;
            for(int j=0;j<x.size()-1;j++)
            {
                if(s2==x.size())
                {
                    break;
                }
                if(x.get(s1) > x.get(s2))
                {
                    temp = x.get(s1);
                    x.set(s1 , x.get(s2));
                    x.set(s2 , temp);
                }
            s1++;
            s2++;
               
            }
        }
        
    }

    public static void print_array(ArrayList<Integer> x) {
        for(int i=0;i<x.size();i++)
        {
            System.out.println(x.get(i));
        }
    }
}



