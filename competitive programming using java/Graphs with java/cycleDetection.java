import java.util.*;


public class cycleDetection {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<data>[] graph = new ArrayList<data>[n+1];
        for(int i=0;i<5;i++)
        {
            int x , y, z;
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
        }

        int[] visited = new int[n+1];
        int[] visiting = new int[n+1];

        for(int i=1;i<=n;i++)
        {
            if(!visited[i]) {
                dfs(graph , i ,n );
            }
        }

    }

    public dfs(ArrayList<data>[] graph , int x ,int n , int[] visited, int[] visiting) {
              visiting[x] = 1;
              for(int i=0;i<graph[i].size();i++)
              {
                  if(visiting[graph[x].get(i).y] == 1) {
                      System.out.println("making a cycle");
                  }

                  if(visited[graph[x].get(i).y] == 0)
                  {
                      dfs(graph , graph[x].get(i).y ,n , visited , visiting );
                  }
              }
              visiting[x] = 0;
              visited[x] = 1;   
    } 

}

class data {

    int y , wei;
    public data(int y , int w)
    {
        this.y = y;
        this.wei = wei;

    }
}