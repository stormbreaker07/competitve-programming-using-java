import java.util.*;

public class adjacencyMatrix {

        

    public static void main(String[] args) {
    
        int[][] graph = new int[100][100];
    
        Scanner scan = new Scanner(System.in);
    
        for(int i=0;i<10;i++)
        {
            int x , y , w;
            x = scan.nextInt();
            y = scan.nextInt();
            w = scan.nextInt();
            graph[x][y] = w;
        }

        for(int i=0;i<100;i++)
        {
            for(int j=0;j<100;j++)
            {
                if(graph[i][j] != 0)
                {
                    System.out.println(i + " " + j + " " + graph[i][j]);
                }
            }

        }

        
    }


}