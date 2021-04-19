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


    public int Search(T data ) {

        Node<T> temp = root;
        
        if(root==  null)
        {
            return -1;
        }

        int i =0;
        while(!temp.data.equals(data)) {
            temp = temp.nextNode;
            i++;
        }

        return i;
    }


    public T Middle() {
        int tempSiz = this.Size/2;
        Node<T> temp = root;
        if(this.size() == 0)
        {
            return (T)("Empty");
        }

        for(int i=0 ;i<tempSiz;i++)
        {
            temp = temp.nextNode;
        }
        return temp.data;

    }

    public void createLoop() {

        if(this.root.nextNode!= null) {
        Node<T> temp2 = this.root;
        
        while(temp2.nextNode != null)
        {
            temp2 = temp2.nextNode;
        }

        temp2.nextNode = this.root.nextNode;
        }
    }

 public Boolean DetectLoop() {
        
        Node<T> turtle = root;
        Node<T> rabbit = root;
        int flag = 0;

        while(turtle!= null && rabbit!= null && rabbit.nextNode!=null )
        {
            turtle = turtle.nextNode;
            rabbit = rabbit.nextNode.nextNode;
            if(turtle == rabbit)
            {
                flag = 1;
                break;
            }
        }

        if(flag ==1)
        {
            return true;
        }
        return false;
    } 
}