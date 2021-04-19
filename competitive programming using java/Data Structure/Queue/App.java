public class App {

    public static void main(String[] args) {

        QueueUsingLinkList<Integer> queue = new QueueUsingLinkList<>();
        queue.push(34);
        queue.push(232);
        queue.push(45);
        queue.push(1266);
        queue.push(4337);
        try{
            System.out.println(queue.peek());
            System.out.println(queue.deque());
            System.out.println(queue.deque());
            System.out.println(queue.deque());
            System.out.println(queue.peek()); 
            System.out.println(queue.deque());
            System.out.println(queue.deque());
            System.out.println(queue.peek());
        
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}