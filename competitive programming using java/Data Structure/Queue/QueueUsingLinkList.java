import java.util.*;

/********* CREATE NODE**********/
class Node<T> {
    T val;
    Node<T> next;

    public Node(T val ) {
        this.val = val;
        this.next = null;
    }

    public Node(T val , Node<T> next) {
        this.val = val;
        this.next = next;
    }
}

 /******* QUEUE USING LINKLIST*********/
//create queue list
// push from back
//pop from front
//peek from front


public class QueueUsingLinkList<T> {

    Node<T> root,last;
    int size;

    public QueueUsingLinkList() {
        root = null;
        last = null;
        size = 0;
    }

    public void push(T val) {
        
        if(root == null) {
            root = new Node(val);
            last = root;
            this.size++;
            return;
        }

        last.next = new Node(val);
        last = last.next;
        this.size++;
        return;

    }

    public T peek() throws EmptyQueueException {

            if(root == null) {
            throw new EmptyQueueException("Queue is Empty");
                
            }
            return root.val;
    }


    public T deque() throws EmptyQueueException {

        if(root == null) {
            throw new EmptyQueueException("Queue is Empty");
        }

        T val = root.val;
        root = root.next;
        this.size--;
        return val;
    }

}

