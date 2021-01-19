package double_linked_list;

class Node {
    
    private int data;
    private Node prev;
    private Node next;

    public Node() {
        this.data =0;
        this.prev = null;
        this.next = null;
    }

    public Node(int data , Node prev ,Node next)
    {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setprev(Node prev) {
        this.prev = prev;
    }
    public void setNext(Node node) {
        this.next = node;
    }

    public int getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }
    
    public Node getPrev() {
        return this.prev;
    }

}
