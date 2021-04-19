import java.util.*;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    public Node<T> root;

    public void insert(T data ) {
        
        if(root == null) {
            root = new Node(data);
            return;
        }
        insert(data , root);
        return ;
    }

    public void insert(T data , Node<T> node) {
        if(node.data.compareTo(data) > 0) {
            //the new node data is less than the data in current node
            if(node.leftChild != null) {
                insert(data , node.leftChild);
            }
            else
            {
                node.leftChild = new Node(data , node);
            }
        }
        else {
            if(node.rightChild != null) {
                insert(data , node.rightChild);
            }
            else
            {
                node.rightChild = new Node(data , node);
            }
        }
    }

    public void remove(T data) {
        
        if(root == null) {
            return;
        }

        remove(data , root);
    }

    public void remove(T data , Node<T> node) {

        if(node ==  null) {
            return;
        }

        if(data.compareTo(node.data) < 0) {
            remove(data , node.leftChild);
        }
        else if(data.compareTo(node.data) > 0) {
            remove(data , node.rightChild);
        }
        else {
            if(node.leftChild == null && node.rightChild== null) {
                if(node.parent!=null && node.parent.leftChild == node) {
                    node.parent.leftChild = null;
                }
                else if(node.parent!=null && node.rightChild == null) {
                    node.parent.rightChild = null;
                }
             
             if(node.parent == null ) {
                 root = null;
             }

             node = null;   
            }
            else if(node.leftChild == null && node.rightChild!= null) {
                Node<T> parent = node.parent;

                if(parent!=null && parent.leftChild== node) {
                    parent.leftChild = node.rightChild;
                }
                else if(parent!=null && parent.rightChild == node) {
                    parent.rightChild = node.rightChild;
                }

                if(parent == null) {
                    root = nulll;
                }

                parent.rightChild.parent = parent;
                node = null;
            }

            else if(node.rightChild==null && node.leftChild!= null) {
                Node<T> parent = node.parent;

                if(parent!=null && parent.leftChild == node) {
                    parent.leftChild = node.leftChild;
                }
                else if(parent!= null && parent.rightChild == node) {
                    parent.rightChild = node.leftChild;
                }

                if(parent == null) {
                    root = null;
                }

                parent.leftChild.parent = parent;
                node = null;
            }

            else {
                Node<T> predecessor = getpredecessor(node.leftChild);
                T temp = predecessor.data;
                predecessor.data = node.data;
                node.data = temp;

                remove(data , predecessor);
            }

        }

    }


    public Node<T> getpredecessor(Node<T> node) {
        
        if(node.rightChild != null) {
            return getpredecessor(node.rightChild);
        }

        return node;
    } 



    public void pre_order() {
        if(root == null) {
            System.out.println("empty binary tree");
        }

        pre_order(root);
    }

    public void pre_order(Node<T> node) {

        if(node == null)
        {
            return;
        }

        System.out.print(node.data);
        pre_order(node.leftChild);
        pre_order(node.rightChild);
    return;
    }

    public void in_order() {

        if(root == null)
        {
            System.out.print("empty binary search tree");
            return ;
        }

        in_order(root);
    }


    public void in_order(Node<T> node) {

        if(node == null)
        {
            return ;
        }

        in_order(node.leftChild);
        System.out.print(node.data + "  ");
        in_order(node.rightChild);

    }


    public void post_order() {
        
        if(root == null)
        {
            System.out.println("empty binary search tree");
            return ;
        }

        post_order(root);
    }

    public void post_order(Node<T> node) {

        if(node == null)
        {
            return ;
        }

        post_order(node.leftChild);
        post_order(node.rightChild);
        System.out.println(node.data + "  ");
        return;
    }




    public T getMax() throws emptyBst {
        if(root == null) {
            throw new emptyBst("binary search tree is empty");
        }

        Node<T> node = root;
     while(node.rightChild!=null)
        {
            node = node.rightChild;
        }
        return node.data;
    }


    public T getMin() throws emptyBst {
        if(root == null) {
            throw new emptyBst("binary search tree is empty");
        }
        Node<T> node = root;
   while(node.leftChild!=null)
        {
            node = node.leftChild;
        }
        return node.data;
    }
}