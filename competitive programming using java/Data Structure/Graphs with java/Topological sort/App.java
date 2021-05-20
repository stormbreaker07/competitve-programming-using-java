import java.util.*;

public class App {

    public static void main(String[] args) {

        TopologicalSort topologicalOrdering = new TopologicalSort();

        ArrayList<Vertex> graph = new ArrayList<>();
        graph.add(new Vertex(0));
        graph.add(new Vertex(1));
        graph.add(new Vertex(2));
        graph.add(new Vertex(3));
        graph.add(new Vertex(4));
        graph.add(new Vertex(5));

        graph.get(0).addVertex(graph.get(1));
        graph.get(3).addVertex(graph.get(2));
        graph.get(5).addVertex(graph.get(3));
        graph.get(4).addVertex(graph.get(5));
        graph.get(0).addVertex(graph.get(4));
        graph.get(1).addVertex(graph.get(5));

        topologicalOrdering.findOrder(graph.get(0));
        topologicalOrdering.printOrder();

    }

}