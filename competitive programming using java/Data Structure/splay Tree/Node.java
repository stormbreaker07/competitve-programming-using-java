import java.util.*;

public class Node<T> {

    public T data;
    public Node<T> leftChild;
    public Node<T> rightChild;
    public Node<T> parent;

    public Node(T data) {
        leftChild = null;
        rightChild = null;
        parent = null;
        this.data = data;

    }

    public Node(T data , Node<T> node) {
        leftChild = null;
        rightChild = null;
        parent = node;
        this.data = data;
    }
}