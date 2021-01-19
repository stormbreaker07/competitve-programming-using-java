import java.util.*;



public class Prims {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n , m;
        n = scan.nextInt();
        m = scan.nextInt();

        ArrayList<data> adj[] = new ArrayList[n+1];
        for(int i=0;i<=n;i++)
        {
            adj[i] = new ArrayList<data>();
        }
        int x , y ,wei;
        
        //TreeSet<data> pr = new TreeSet<>(new compareIt() );



        for(int i=0;i<m;i++)
        {
            x = scan.nextInt();
            y = scan.nextInt();
            wei = scan.nextInt();

            adj[x].add(new data(wei, y));
            adj[y].add(new data(wei ,x));
        }

        operation(1, adj , n , m);
    }

    public static void operation(int x , ArrayList<data> adj[] , int n ,int m) {

        int marked[] = new int[n+1];
        int minCost=0;
        PriorityQueue<data> q = new PriorityQueue<>(new compareIt());

        q.add(new data(0 ,x));
        while(!q.isEmpty())
        {
            data p = q.poll();
            if(marked[p.vert] == 1 )
            {
                continue;
            }
            minCost += p.wei;
            marked[p.vert] = 1;
            for(int i=0;i<adj[p.vert].size();i++)
            {
                data y = adj[p.vert].get(i);
                if(marked[y.vert] == 0)
                {
                    q.add(y);
                }
            }

        }
        System.out.println(minCost);
    }    









}


class compareIt implements Comparator<data> {

    public int compare(data x, data y) {
        if(x.wei - y.wei == 0)
        {
            return 1;
        }
        return x.wei - y.wei;
    }
}



class data{
    int wei , vert;
    public data(int wei , int vert) {
        this.wei = wei;
        this.vert = vert;
    }

    // public int compareTo(data x) {
    //     return this.wei - x.wei;
    // }

    public String toString() {
        return ("weight " + this.wei + ", vertex " + this.vert);
    }


}