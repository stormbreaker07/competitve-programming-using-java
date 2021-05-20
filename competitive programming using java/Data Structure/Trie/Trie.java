import java.util.*;

public class Trie {

    public Node root;

    public Trie() {
        root = new Node('\0');
    }

   
    //now to add a String we think it recursively
    //first start from root search for index i in string
    //if there is a child at index them make it temp
    //else create one
    //do it recursively until i == length-1 of string or say there is no element to insert
    //at that point make the node terminating
    public void add(String s) {

        add( s , root);

    }

    private void add(String s , Node root) {

        if(s.length() ==0) {
            root.terminating = true;
            return;

        }

        int pos = s.charAt(0) - 'a';
        Node child = root.children[pos];
        if(child == null) {
            child = new Node(s.charAt(0));
            root.children[pos] = child;
            root.childCount++;

        }

        add(s.substring(1) , child);
    }



    //Search as a work
    //first start from starting index of string
    //recursively check if there is a solution that if char is present on
    //dedicated index
    //if yes then move recursively else return false
    //if you reach string.length ==0 then check if node is a terminating node or not

    public Boolean search(String s) {

        return search(s , root);
    }

    public Boolean search(String s , Node root) {

        if(s.length() == 0) {
            if(root.terminating) {
                return true;
            }
            else
            {
                return false;
            }
        }

        int pos = s.charAt(0) - 'a';
        Node child = root.children[pos];
        if(child == null) {
            return false;
        }

        return search(s.substring(1) , child);

    }


    //Remove
    //removing the string is a tricky one   
    public void remove(String s) {
        
        remove(s , root);
    }

    public void remove(String s, Node root) {

        if(s.length() == 0) {
            root.terminating = false;
            return ;
        }

        int pos = s.charAt(0) - 'a';
        Node child = root.children[pos];
        if(child == null) {
            return ;
        }

        remove(s.substring(1) , child);

        if(!child.terminating && child.childCount==0) {
            root.children[pos] = null;
            root.childCount--;
            child = null;
        }
    }

    //AutoComplete
    public List<String> autoComplete(String s) throws RuntimeException{

            Node temp = root;
            List<String> strings = new ArrayList<>();
            for(int i=0;i<s.length();i++) {

                int pos = s.charAt(i) - 'a';
                Node child = temp.children[pos];
                if(child == null) {
                    throw new RuntimeException("No string of this prefix is present"); 
                }
                temp = child;
                }

                 autoComplete(s , temp , strings);
                 return strings;
        }

    private void autoComplete(String prefix , Node root , List<String> list) {

            if(root == null) {
                return;
            }

            if(root.terminating) {
                list.add(prefix);
            }

            for(Node x: root.children) {
                if(x == null) {
                    continue;
                }
                char s = x.character;
                autoComplete(prefix+s , x , list);
            }
            return;

    }

} 