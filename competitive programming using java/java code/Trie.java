
import java.util.*;


class TrieNode {

    char data;
    int isTerminating;
    TrieNode[] children;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = 0;
        children = new TrieNode[26];
    }


}



public class Trie {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    TrieNode root = new TrieNode('\0');
            addWord(s , root);
            String w = scan.nextLine();
            if(search(w, root) == true)
            {System.out.println("present in trie");}
            else
            {System.out.println("not present in");}
            w = scan.nextLine();
            delete(w , root);
            w = scan.nextLine();
             if(search(w, root) == true)
            {System.out.println("present in trie");}
            else
            {System.out.println("not present in");}
    }


    public static void delete(String s , TrieNode root)
    {

        if(s.length()==0)
        {
            root.isTerminating = 0;
            return ;
        }
    int index = s.charAt(0) - 'a';
        TrieNode child = root.children[index];
        if(root.children[index] == null)
        {
            return ;
        }

        delete(s.substring(1) , root.children[index]);
        if(child.isTerminating == 0)
        {
            int cont =0;
            for(int i=0;i<26;i++)
            {
                if(child.children[i] != null)
                {
                    cont++;
                }
            }

            if(cont == 0)
            {
                root.children[index] = null;
                child = null;
            }
        }

    }

    //Searching in trie
    public static boolean search(String s , TrieNode root) {

        TrieNode temp = root;
        for(int i=0;i<s.length();i++)
        {
            int index = s.charAt(i) - 'a';
            if(temp.children[index] == null)
            {
                return false;
            }
            else
            {
                temp = temp.children[index];
            }
        }

            if(temp.isTerminating == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
    }


    //adding string
    public static void addWord(String s, TrieNode root)
    {
        TrieNode temp = root;
       
        for(int i=0;i<s.length();i++)
        {
                 int index = s.charAt(i) - 'a';
       
            if(temp.children[index] == null)
                {
                temp.children[index] = new TrieNode(s.charAt(i));
            }
            temp = temp.children[index];
        }

        temp.isTerminating = 1;
    }

   }
