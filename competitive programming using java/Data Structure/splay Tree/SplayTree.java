import java.util.*;

public class SplayTree<T extends Comparable<T> > implements Tree<T> { 

    public Node<T> root =  null;

    public void insert(T data) {

        if(this.root == null) {
            root = new Node<T>(data);
            return;
        }
        insert(T data , this.root);
        return;
    }

    public void insert(T data , Node<T> node) {
        
        if(node.data.compareTo(data) > 0 ) {
            
            if(node.leftChild != null) {
            insert(data , node.leftChild);
            }
            else {
               Node<T> newNode = new Node<T>(data , node);
                node.leftChild = newNode;
                splay(newNode);
            }
        }
        else if(node.data.compareTo(data) < 0) {
            
            if(node.rightChild != null) {
            insert(data , node.rightChild);
            }
            else {
                Node<T> newNode = new Node<T>(data , node);
                node.rightChild = newNode;
                splay(newNode);
            }
        }       
        else 
        {
            return;
        }

    }


    public void rightRotation(Node<T> node) {
        System.out.println("rotation to the right on node" + node.data);
        Node<T> tempLeftNode = node.leftChild;
        NOde<T> grandChild = tempLeftNode.rightChild;

        tempLeftNode.rightChild = node;
        node.leftChild = grandChild;

        if(grandChild != null) {
            grandChild.parent = node;
        }

        Node<T> tempParent = node.parent;
        node.parent = tempLeftNode;
        tempLeftNode.parent = tempParent;

        if(tempLeftNode.parent != null && tempLeftNode.parent.leftChild== node  )


    }















    public void search(T data ) {
        if(root!= null) {
            search(data , this.root);
        }
        return null;
    }

    public void search(T data , Node<T> node) {

        if(node.data.compareTo(data) > 0) { 
            search(data , node.leftChild);
        }
        else if(node.data.compareTo(data) < 0) {
            search(data , node.rightChild);
        }
        else
        {
            splay(node);
            return;
        }
    }

    public void splay(Node<T> node) {

            while(node.parent!=null) {

                //so called zig situation
                if(node.parent.parent == null) {

                    if(node.parent.leftChild = node) {
                        rightRotation(node.parent);
                    }
                    else {
                        leftRotation(node.parent);
                    } 
                }
                else if(node.parent.leftChild = node && node.parent.parent.leftChild = node.parent) {
                    rightRotation(node.parent.parent);
                    rightRotation(node.parent); 
                }
                else if(node.parent.rightChild = node && node.parent.parent.rightChild = node.parent) {
                    leftRotation(node.parent.parent);
                    leftRotation(node.parent);
                }
                else if(node.parent.leftChild = node && node.parent.parent.rightChild = node.parent) {
                    rightRotation(node.parent);
                    leftRotation(node.parent);
                }
                else if(node.parent.rightChild = node && node.parent.parent.leftChild = node.parent) {
                    leftRotation(node.parent);
                    rightRotation(node.parent);
                }
            }
    }

























    public void traverse() {
        if(root!=null) {
            traverse(this.root);
        }
        return;
    }

    public void traverse(Node<T> node) {

        if(node.leftChild!=null) {
            traverse(node.leftChild);
        }
        
        System.out.println(node.data);

        if(node.rightChild!=null) {
            traverse(node.rightChild);
        }
    }

}
