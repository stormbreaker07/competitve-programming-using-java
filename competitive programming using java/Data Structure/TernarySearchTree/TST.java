public class TST {

    public Node root;

    public void insert(String key , int val) {
        root = add(key , val , root , 0);
    }


    public Node add(String key , int val , Node node , int index) {
        int c = key.charAt(index);

        if(node == null) {
            node = new Node(c);
        }

        if(c < node.character) {
            node.leftChild = add(key , val , node.leftChild , index);
        }
        else if(c > node.rightChild) {
            node.rightChild = add(key , val , node.rightChild , index);
        }
        else if(index < key.length()-1) {
            node.middleChild = add(key , val , node.middleChild , index+1);
        }
        else {
            node.terminating = true;
            node.val = val;
        }

        return node;
    }


    public int getValue(String key) {
        Node node = search(key , root , 0);
    
        if(node == null) {
            return null;
        }
        else node.val;
    }

    public Node search(String key , Node node , int index) {

        if(node == null) {
            return null;
        }

        int c = key.charAt(index);

        if(c < node.character) {
            return search(key , node.leftChild , index);
        }
        else if(c > node.character ) {
            return search(key , node.rightChild , index);
        }
        else if( index < key.length()-1) {
            return search(key , node.middleChild , index+1);
        }
        else {
            if(node.terminating == true) {
                return node;
            }
            return null;
        }

    }


    public void traverse() {
            traverse(root, "");   
    }

    public void traverse(Node node , String s) {

        if(node.middleChild == null || node.val!=0) {
            System.out.println("{ key :" + s + ", value" + node.val + " }");
            return ;
        }

        if(node.leftChild != null ) {
            traverse(node.leftChild , s);
        }

        if(node.rightChild != null) {
            traverse(node.rightChild , s);
        }

        if(node.middleChild != null) {
            traverse(node.middleChild , s + node.character);
        }


    }

}