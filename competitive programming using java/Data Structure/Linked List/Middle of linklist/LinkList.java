public class LinkList<T> implements List<T> {

    public Node<T> root = null;
    private int Size = 0;
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            insertEnd(root , newNode);
        }
        this.Size++;
    }

    // it will take place in O(1) time complexity
    public void insertBeginning(Node<T> root ,Node<T> newNode) {
          newNode.nextNode = root;
            this.root = newNode;
    }

    //it will take place in O(N) time complexity
    public void insertEnd(Node<T> root , Node<T> newNode) {
        if(root.nextNode!= null) {
            insertEnd(root.nextNode ,newNode);
        }
        else {
        root.nextNode = newNode;
        newNode.nextNode = null;
        }

        return ;
    }

    public void remove(T data) {

        if(root == null) 
        {
            return ;
        }
        else {
            Node<T> prev = null;
            remove(data , this.root ,prev );
        }
        }

    public void remove(T data , Node<T> temp ,Node<T> prev ) {
        
        if(temp!= null && temp.data.equals(data))
        {
            this.root = temp.nextNode;
            return ;
        }
        
        while(temp!= null && !temp.data.equals(data)) {
            prev = temp;
            temp = temp.nextNode;
        }

        if(temp == null)
        {
            return ;
        }

        prev.nextNode = temp.nextNode;
        this.Size--;

        return ;

    }

    

    public void traverse() {
      Node<T> temp = root;
        while(temp!= null)
        {
            System.out.println(temp.data);
            temp= temp.nextNode;
        }

    }

    
    public int size() {
        return this.Size;
    }

    public T Middle() {
        Node<T> temp1 = root;
        Node<T> temp2 = root;
        while(temp2.nextNode!=null)
        {
            temp1 = temp1.nextNode;
            temp2 = temp2.nextNode.nextNode;
        }
        return temp1.data;
    }
    

}