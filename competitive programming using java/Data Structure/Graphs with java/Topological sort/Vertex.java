import java.util.*;

public class Vertex {

    public int data;
    public Boolean isVisited;
    public ArrayList<Vertex> list;


    public Vertex(int data) {
        this.data = data; 
        list =new ArrayList<Vertex>();
        isVisited = false;
    }

    public void addVertex( int data) {
        list.add(new Vertex(data));
    }

    public void addVertex(Vertex v) {
        list.add(v);
    }

    public int ToString() {
        return this.data;
    }
}