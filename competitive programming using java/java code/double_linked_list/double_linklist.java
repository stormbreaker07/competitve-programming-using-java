package double_linked_list;

class double_linklist {


    private int size;
    private Node start;

    public double_linklist() {
        this.size =0;
        this.start = null;
    }


    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if(this.size ==0)
        {
            return true;
        }
        return false;
    }

    private Node createNode(int data) {
        Node x = new Node();
        x.setData(data);
    return x;
    
    }

    public void insertAtFont(int data) {
    
        Node x = createNode(data);
        x.setprev(this.start);
        x.setNext(null);
        this.start = x;
    
    }

    public void insertAtEnd(int data) {
        Node x = createNode(data);

        if(start == null)
        {
            x.setNext(null);
            x.setprev(null);
            start = x;
        }
        else
        {
            Node t = start;
            while(t.getNext() != null)
            {
                t = t.getNext();
            }
            x.setprev(t);
            t.setNext(x);
            x.setNext(null);

        }
    }


    public void insertAtpoint(int data , int pos) {
        if(pos == 1 )
        {
            insertAtFont(data);
        }
        else if(pos == size+1)
        {
            insertAtEnd(data);
        }
        else if(pos>1 && pos<= size)
        {
            Node t = start;
            for(int i=2;i<pos-1;i++)
            {
                
                t = t.getNext();
            }
            Node x = createNode(data);
            x.setprev(t);
            t.setNext(x);
            x.setNext(t.getNext());
        }
        else
        {
            System.out.println("insertion at this index is not possible");
        }

    }


    


}
