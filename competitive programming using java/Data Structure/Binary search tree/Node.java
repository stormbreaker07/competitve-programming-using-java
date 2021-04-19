import java.util.*;

public class Node<T> {

    T data;
    Node<T> leftChild;
    Node<T> rightChild;
    Node<T> parent;

    public Node(T val) {
        this.data = val;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }

    public Node(T val , Node<T> parent) {
        this.data = val;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = parent;
    }
}

