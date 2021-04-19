import java.util.*;

public class ReverseList {

    public static void main(String[] args) {

        LinkList<String> names = new LinkList<>();
        names.insert("Tanuj");
        names.insert("Manu");
        names.insert("Viwaan");
        names.insert("tomcat");
        names.insert("Megha");
        names.insert("java");
        names.insert("mustang gt");
        
        Node<String> root = names.root;
        Node<String> curr = names.root;
        Node<String> prev = names.root;

        if(names.size() >=2)
        {
            prev = root;
            curr = root.nextNode;
            prev.nextNode=null;
            root = reverseList(prev , curr);
            
            while(root!=null)
            {
             System.out.println(root.data);
             root = root.nextNode;   
            }
        }
        
        
        }

    
        public static Node<String> reverseList(Node<String> prev , Node<String> curr) {
            Node<String> temp = curr.nextNode;
            
            if(temp!= null)
            {
            curr.nextNode = prev;
            prev = curr;
            curr = temp;
            reverseList(prev , curr);
            }

                curr.nextNode = prev;
                return curr;
        }

}