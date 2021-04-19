import java.util.*;

//create the node for the element in the stack
class Node<T> {
    T val;
    Node<T> next; 
    public Node(T val) {
        this.val = val;
        this.next = null;
    }

    public Node(T val ,Node<T> next) {
        this.val = val;
        this.next = next;
    }
}

public class StackUsingLinkList<T> {

    public Node<T> root;
    public Node<T> temp;
    public int size;
    public StackUsingLinkList() {
        //initializing the instance in the stack
        root = null;
        temp = null;
        this.size = 0;
    }   


    //pushing the element in the starting.
    //so the time complexity is O(1) that is constant time
    public void push(T val ) {
        if(this.root == null) {
            root = new Node(val , null);
            temp = root;
            this.size++;
            return; 
        }
        Node<T> curr = new Node(val , root);
        root = curr;
        this.size++;
        return ;
    }

    //see the element present on the top of stack
    // time complexity is O(1).
    //throw custom exception when stack is empty
    public T peek() throws EmptyStackException{
        if(root == null)
        {
            throw new EmptyStackException("Empty stack");
        }
        return root.val;
    }

    //taking/poping out the top element in the stack
    //custom exception is thrown we try to pop when the stack is empty
    public T pop() throws EmptyStackException {
        if(root == null) {
            throw new EmptyStackException("Empty stack");
        }

        T val = root.val;
        root = root.next;
        this.size--;
        return val;
    }
    
}