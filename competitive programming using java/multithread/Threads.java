//import java.util.*;

public class Threads {

    public static void main(String[] args) {

        Thread thread = new Thread( new Runnable() {
                public void run() {
                    System.out.println("now this thread is executed " + Thread.currentThread().getName());
                }
        });

        thread.setName("New work Thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println( "let start the thread");
        thread.start();
        System.out.println("now the thread is started " + Thread.currentThread().getName());
    }
}