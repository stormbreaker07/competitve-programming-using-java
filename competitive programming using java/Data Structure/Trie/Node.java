public class Node {

    public char character;
    public Node[] children;
    public Boolean terminating;
    public int childCount;

    public Node(char c) {
        character = c;
        children = new Node[26];
        terminating= false;
        childCount=0;
    }
}