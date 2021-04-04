import java.util.*;

public class Dfs {

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

        int[] visited = new int[n+1];

        dfs(graph , 1 , n , visited);
    }

    public static void dfs(ArrayList<data>[] graph , int s , int n , int[] visited) {

        
        visited[s] = 1;
        System.out.println(s);

        for(int i=0;i<graph[s].size();i++)
        {
            int x = graph[s].get(i).y;
            if(visited[x] == 0)
            {dfs(graph , x , n ,visited);}
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