import java.util.*;

public class adjacencyList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n;
        n = scan.nextInt();

        ArrayList<data> adj[] = new ArrayList[n+1];
        for(int i=0;i<n+1;i++)
        {
            adj[i] = new ArrayList<data>();
        }


        for(int i=0;i<5;i++)
        {
            int x,y,w;
            x = scan.nextInt();
            y = scan.nextInt();
            w = scan.nextInt();

            adj[x].add(new data(y , w));
        }

        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<adj[i].size();j++)
            {
                System.out.println("vertex =" + i + " "  + adj[i].get(j));
            }
        }
    }


}


class data {

    int wei , vert;
    public data(int y , int w)
    {
        this.vert = y;
        this.wei = w;
    }

    public String toString() {
        return("vertex =" + this.vert + ", weight =" + this.wei);
    }
}