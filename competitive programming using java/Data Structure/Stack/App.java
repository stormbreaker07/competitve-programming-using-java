import java.util.*;

public class App {

    public static void main(String[] args) {

        StackUsingLinkList<Integer> stack = new StackUsingLinkList<>();
        stack.push((Integer)20);
        stack.push((Integer)34);
        stack.push((Integer)232);
        stack.push((Integer)19);

        System.out.println(stack.size);
        
        try {
        System.out.println(stack.peek());
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        }
        catch(Exception E) {
            System.out.println(E);
        }
    }
}
