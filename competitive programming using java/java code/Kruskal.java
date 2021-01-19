import java.util.*;

// edge class implements comparable to make array of edge sorted by weight
class Edge implements Comparable<Edge>{

    public int  u,v,wei;

    public Edge(int u , int v ,int wei) {
        this.u = u;
        this.v = v;
        this.wei = wei;
    }

//to see the data clearly override the method
    public String toString() {
        return ("vertex " + this.u + " , " + this.v + " . have wei " + this.wei);
    }

//comparable method override
    public int compareTo(Edge d1) {
        return this.wei - d1.wei;
    }

}


//this. is the main class 
public class Kruskal {

    
    public static void main(String[] args) {
    
    Scanner scan= new Scanner(System.in);
    int n, m;
    // n for vertex and m for edges
    n = scan.nextInt();
    m = scan.nextInt();

    Edge graph[] = new Edge[m];
    
    int u , v, wei;
    
    //fill the graph made of edges as index
    for(int i=0;i<m;i++)
    {
        u = scan.nextInt();
        v = scan.nextInt();
        wei = scan.nextInt();
        graph[i] = new Edge(u ,v ,wei);
    }

// disjoint set union
    int dsu[] = new int[n+1];

    for(int i=0;i<=n;i++)
    {
        dsu[i] = i;
    }
    
    //sort the array of edges to make non decreasing wei array
    Arrays.sort(graph);
    
    for(int i=0;i<m;i++)
    {
        System.out.println(graph[i]);
    }


    int total =0;
    //resultent result ArrayList
    ArrayList<Edge> result = new ArrayList<>();
    for(int i=0;i<m;i++)
    {
        u = graph[i].u;
        v = graph[i].v;
        int root_x = root(u , dsu);
        int root_y = root(v , dsu); 
        if(root_x != root_y)
        {
            total +=graph[i].wei;
            result.add(graph[i]);
        
            union(u , v ,dsu);
        } 

    }

    System.out.println(total);
    }


    // to find the root of a vertex
    static int root(int x , int a[]) {

        while(a[x] != x) {
            a[x] = a[a[x]];
            x = a[x];
        }  
        return x;
    }

    //to join to vertex of a array
    static void union(int x , int y , int a[]) {

        int root_y = root(y , a);
        int root_x = root(x , a);

        if(root_x != root_y)
        {
            a[root_x] = a[root_y]; 
        }
    }

}