import java.util.*;

public class detectLoop {


    public static void main() {

      Node<Integer> root = list.root;

     LinkList<Integer> list = new LinkList<>();
        list.insert(19);
        list.insert(23);
        list.insert(321);
        list.insert(662);
        list.insert(820);
        list.insert(65);
        list.insert(80);
        list.insert(120);
        list.insert(20);
        list.insert(82);

        root = list.root;
        createLoop(root);
        Boolean ans = DetectLoop(root);
        System.out.println(ans);

    }

    public static void createLoop(Node<Integer> root) {

        if(this.root.nextNode!= null) {
        Node<T> temp2 = this.root;
        
        while(temp2.nextNode != null)
        {
            temp2 = temp2.nextNode;
        }

        temp2.nextNode = this.root.nextNode;
        }
    }

    public static Boolean DetectLoop(Node<T> root) {
        
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