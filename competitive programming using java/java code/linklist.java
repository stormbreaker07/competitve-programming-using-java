import java.util.*;


public class linklist {
    
    public static void main(String[] args) {

        Linkedlist list = new Linkedlist();
        list.insertAtFont(14);
        list.insertAtFont(11);
        list.insertAtFont(9);
        list.insertAtFont(7);
        list.insertAtFont(5);
        list.insertAtFont(2);
        list.insertAtEnd(20);
        System.out.println("size of the list " + list.getListsize());
       // list.viewList();
       list.deleteAtpoint(3);
        list.viewList();
    }

}



class Node {

    private int data;
    private Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data , Node next) {
        this.data = data;
        this.next = next; 
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

}


class Linkedlist {

private int size;
private Node start;

    public Linkedlist()
    {
        this.size = 0;
        this.start = null;
    }


    public int  getsize() {
        return this.size;
    }

    public Node getstart() {
        return this.start;
    }

    

    public void setnext(Node next) {
        this.start = next;
    }

    public boolean isEmpty() {
        if(this.size !=0)
        {
            return false;
        }
        return true;
    } 


    public void viewList() {
        if(isEmpty())
        {
            System.out.println("list is empty");
        }
        else{
            Node t = start;
            for(int i=0;i<=size;i++)
            {
                System.out.println(t.getData());
                t = t.getNext();
            }
        }
    }


    public void insertAtFont(int data) {

        Node x = new Node();
        x.setData(data);
        if(this.start == null)
        {
            this.start = x;
        }
        else
        {
            x.setNext(start);
            start = x;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node t;
        Node x = new Node();
        x.setData(data);
        t = start;
        if(t == null)
        {
            start = x;
        }
        else
        {
            while(t.getNext() != null)
            {
                t = t.getNext();
            }
            t.setNext(x);
        }
        size++;
    }

    public void insertAtpoint(int data , int pos) {
        
        if(pos == 1)
        {
            insertAtFont(data);
        }
        else if(pos == size+1)
        {
            insertAtEnd(data);
        }
        else if(pos > 1 && pos <= size)
        {
            Node x = new Node();
            x.setData(data);
            Node t = start;
            for(int i=1;i<pos-1 ;i++)
            {
                t = t.getNext();
            }   
            t.setNext(x);
            size++;
        }
        else
        {
            System.out.println("insertion at this index is not possible");
        }

    }

    public void deleteFirst() {
        Node t = this.start;
        t = t.getNext();
        start = t;
        size--;
    }

    public void deleteEnd() {
        Node t = start;
        for(int i=1;i<size-1;i++)
        {
            t = t.getNext();
        }
        t.setNext(null);;
        size--;
    }

    public void deleteAtpoint(int pos) {
        Node t = this.start;
        if(pos == 1)
        {
            deleteFirst();
        }
        else if(pos == size)
        {
            deleteEnd();
        }
        else if(pos > 1 && pos < size )
        {
            for(int i=1;i<pos-1;i++)
            {
                t = t.getNext();
            }
            Node w = t.getNext();
            t.setNext(w.getNext());
            size--;
        }
    }

    public int getListsize() {
        return this.size;
    }
}