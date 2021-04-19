import java.util.*;

class ListNode<T> {
    public T val;
    public ListNode<T> next;

    public ListNode(T val) {
    this.val =  val;
    this.next = null;
    }

}

public class reverseList {

    public static void main(String[] args) { 
    ListNode<Integer> list = new ListNode(-1);
    list.next = new ListNode(10);
    ListNode<Integer> root = list.next , temp= root;
    temp.next = new ListNode(23);
    temp = temp.next;
    temp.next = new ListNode(4009);
    temp = temp.next;
    temp.next = new ListNode(89);
    temp = temp.next;
    temp.next = new ListNode(4345);
    temp = temp.next;
    temp.next = new ListNode(254);
    temp = temp.next;
    temp.next = new ListNode(176);

    temp = root;
    while(temp!= null)
    {
        System.out.println(temp.val);
        temp = temp.next;
    }
    
    temp = reverse(root);
    
    while(temp!= null)
    {
        System.out.println(temp.val);
        temp = temp.next;
    }
    
    }


    public static ListNode<Integer> reverse(ListNode<Integer> root) {
        ListNode<Integer> prev= null , curr = root , next = null;

        while(curr!= null) {
            next =curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}