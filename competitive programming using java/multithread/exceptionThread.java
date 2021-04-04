import java.util.*;

public class exceptionThread {

    public static void main(String[] args) throws InterruptedException{

        Thread thread = new Thread(new Runnable() {
            public void run() {

            }
        });

        thread.setName("Misbehaving thread");

        thread.setUncaughtExceptionHandler(new Thread.setUncaughtExceptionHandler() {
            
        });

    }
}