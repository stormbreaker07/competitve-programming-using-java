import java.util.*;

class Edge {
    int wei , u ,v;
    public Edge() {
        this.wei =0;
        this.u =0;
        this.v = 0;
    }
}


class Graph {
    int v;
    int e;
    Edge edge[] ;

    public Graph(int v , int e ) {
        this.v = v;
        this.e = e;
        edge = new Edge[e];
        for(int i=0;i<e;i++)
        {
            edge[i] = new Edge();
        }
    }
}



public class BellmanFord {


public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int t;
    t = scan.nextInt();
    while(t>0) {
    int v ,e;
    
    v = scan.nextInt();
    e = scan.nextInt();
    Graph gh = new Graph(v , e);
    for(int i=0;i<e;i++)
    {
        gh.edge[i].u = scan.nextInt();
        gh.edge[i].v = scan.nextInt();
        gh.edge[i].wei = scan.nextInt();
    }

    bellmanFord(gh , 0);
    t--;
    }
}

public static void bellmanFord(Graph gh , int s) {
    int E = gh.e;
    int V = gh.v;

    int dist[] = new int[V];
    for(int i=0;i<V;i++)
    {
        dist[i] = Integer.MAX_VALUE;
    }
    dist[s] = 0;

    for(int i=1;i<V;i++){

        for(int j=0;j<E;j++) {
            int x = gh.edge[j].u;
            int y = gh.edge[j].v;
            int wei = gh.edge[j].wei;
        //System.out.println(x + " " + y + " " + wei);

            if(dist[x] != Integer.MAX_VALUE && dist[y]>dist[x]+wei)
            {
                dist[y] = dist[x]+wei;
            }
        }
    }

int flag=0;
            for(int j=0;j<E;j++) {
            int x = gh.edge[j].u;
            int y = gh.edge[j].v;
            int wei = gh.edge[j].wei;

            if(dist[x] != Integer.MAX_VALUE && dist[y]>dist[x]+wei)
            {
                System.out.println("1");
                flag=1;     
            }
        }
            if(flag == 0)
               { 
                   System.out.println("0");
               }        


        //printArr(dist, V); 

}


public static void printArr(int dist[] , int V)
{
    for(int i=0;i<V;i++) {
    System.out.println("the dist is " + dist[i] + " and the vertex is " + i);
    }

}


}