import java.util.*;

public class TopologicalSort {

    public Stack<Vertex> order;

    public TopologicalSort() {
        this.order = new Stack<>();
    }

    public void findOrder(Vertex v) {

        v.isVisited = true;
        ArrayList<Vertex> list = v.list;

        for(Vertex x : list) {
            if(x.isVisited == false) {
                findOrder(x);
            }
        }
        order.push(v);
        return;
    }

    public void printOrder() {
        while(!order.empty()) {
            System.out.println(order.peek().ToString());
            order.pop();
        }
    }
}