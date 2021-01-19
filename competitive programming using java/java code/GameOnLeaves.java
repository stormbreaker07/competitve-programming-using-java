import java.util.*;

public class GameOnLeaves {

    public static void main(String[] args) {

        int n,x;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        x = scan.nextInt();

        ArrayList<Integer>[] list =new  ArrayList[n+1];
        for(int i=0;i<=n;i++)
        {
            list[i] = new ArrayList<Integer>();
        }
int a , b;
        for(int i=1;i<n;i++)
        {
            a = scan.nextInt();
            b = scan.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        for(int i=1;i<=n;i++)
        {
            System.out.println("the row " + i + "have element");
            list[i].forEach(System.out::println);

        }

        int[] level = new int[n+1];
        BFS(list , x , level ,n);

        int[] elem_l = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            if(list[i].size()<=1)
            {
                elem_l[level[i]]++;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(elem_l[i]);
        }

    }

    static void BFS(ArrayList[] v , int s , int[] level ,int n)
    {
        int[] visit = new int[n+1];
        //use queue
        Deque<Integer> q = new ArrayDeque<>();
        q.add(s);
        visit[s] = 1;
        while(q.size() >0)
        {
            int w = q.pop();    
            v[w].forEach(x -> {
                if(visit[(int)(x)]!=1)
                {
                    level[(int)(x)] = level[w]+1;
                    visit[(int)(x)] = 1;
                    q.add((Integer)(x));
                }
            });

        }


    }

}