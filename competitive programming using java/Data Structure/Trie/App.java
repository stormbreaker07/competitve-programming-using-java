import java.util.*;

public class App {

    public static void main(String[] args) {

        Trie tree = new Trie();
        Node q = new Node('\0');
        tree.add("apple");
        tree.add("apps");
        tree.add("mango");
        tree.add("banana");
        tree.add("approach");
        tree.add("manapa");
        
        try {
            List<String> list = tree.autoComplete("");
            for(String x : list) {
                System.out.println(x);
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }


}