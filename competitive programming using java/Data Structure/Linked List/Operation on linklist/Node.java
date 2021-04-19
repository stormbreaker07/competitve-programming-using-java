import java.util.*;

public class Node <T> {

    public T data;
    public Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setData(T data ) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
