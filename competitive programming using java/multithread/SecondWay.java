//import java.util.*;

public class SecondWay {

    public static void main(String[] args) {

        newThread thread = new newThread();
        thread.setName("first thread");
        thread.run();
    }

}


class newThread extends Thread {

    public void run() {
        System.out.println("now the thread is " + this.getName());
    }

}