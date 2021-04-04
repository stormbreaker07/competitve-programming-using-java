import java.util.*;

public class  Bfs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        ArrayList<data> graph[] =  new ArrayList[n+1];
        for(int i=0;i<=n;i++)
        {
            graph[i] = new ArrayList<data>();
        }

        for(int i=0;i<6;i++)
        {
            int x,y,w;
            x = scan.nextInt();
            y = scan.nextInt();
            w = scan.nextInt();
            graph[x].add(new data(y,w));

        }

        bfs(graph , 1 , n);
    }

    public static void bfs(ArrayList<data> graph[] , int s ,int n) {

        LinkedList<Integer> queue = new LinkedList<Integer>();
        int[] visited = new int[n+1];

        queue.add(s);
        visited[s] = 1;

        while(queue.size() !=0)
        {
            s = queue.poll();
            System.out.println(s);

            for(int i=0;i<graph[s].size();i++)
            {
                if(visited[graph[s].get(i).y] == 0)
                {
                    visited[graph[s].get(i).y] = 1;
                    queue.add(graph[s].get(i).y);
                }
            }
        }
    }

}


class data {

    int y , wei ;
    public data(int y , int w ) 
    {
        this.y = y;
        this.wei = w;
    }

    public String toString() 
    {
        return("vertex = " + this.y + "weight = " + this.wei);
    }
}