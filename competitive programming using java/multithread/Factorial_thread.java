import java.util.*;

public class Factorial_thread {

   
    public static void main(String[] args) {
         int[] element = new int[5];
        Random random = new Random();
        for(int i=0;i<5;i++)
        {
            element[i] = random.nextInt(100000);
        }

        ArrayList<Thread> allThreads = new ArrayList<Thread>();
        for(int x : element) {
            Thread thread = new Thread(new Factorial(x));
            allThreads.add(thread);
            thread.start();
        }

        for(Thread thread : allThreads) {
            try {
            thread.join(50);
            thread.interrupt();
            }
            catch(Exception e) {
                 System.out.println("this is what we called join exception");
            }
        }

    }
}

class Factorial extends Thread {
    
    int num;
    
    public Factorial(int num) {
        this.num = num;
    }

    public void run() {
        int x=0;

        for(int i=1;i<=num;i++)
        {
            if(Thread.currentThread().isInterrupted())
            {
                System.out.println("stop using interruption");
                break;
            }
               // System.out.println("interruption");
       
            x+=i;
        }
       
    System.out.println(x);
    }
}