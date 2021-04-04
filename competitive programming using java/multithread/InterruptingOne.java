//import java.util.*;

public class InterruptingOne {

    public static void main(String[] args) {

        Thread thread = new Thread(new BlockingTask());
        thread.start();
        try {
        Thread.sleep(6000);
        }
        catch(Exception e ) {
            System.out.println("we give this main thread sometime ok");
        }
        thread.interrupt();
    }

}

class BlockingTask extends Thread {

        public void run() {
            while(true)
            {
            try {
                Thread.sleep(5000);

            }
            catch(Exception e) {
                break;
            }
            System.out.println("Exiting the BlockingTask");
            }
        }
}