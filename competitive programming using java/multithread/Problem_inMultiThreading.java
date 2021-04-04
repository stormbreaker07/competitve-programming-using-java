    //import java.util.*;

    public class Problem_inMultiThreading {

        public static void main(String[] args) {
            NormalOperation x = new NormalOperation();
            DecreamentOperation decre = new DecreamentOperation(x);
            IncreamentOperation Incre = new IncreamentOperation(x);

            Thread thread1 = new Thread(decre);
            Thread thread2 = new Thread(Incre);

            thread1.start();
            
            thread2.start();
            try {
            thread1.join();
            }catch(InterruptedException e) {
            }
            try {
            thread2.join();
            }
            catch(InterruptedException e) {
            }

            System.out.println(x.value);
        }
    }

    class DecreamentOperation extends Thread {

        NormalOperation counter;

        public DecreamentOperation(NormalOperation counter) {
            this.counter = counter;
        }

        public void run() {

            for(int i=0;i<1000;i++) {
                this.counter.DecreamentValue();
            }
        }
    }


    class IncreamentOperation extends Thread {

        NormalOperation counter;

        public IncreamentOperation(NormalOperation counter) {
            this.counter = counter;
        }

        public void run() {

            for(int i=0;i<1000;i++)
            {
                this.counter.IncreamentValue();
            }
        }
    }


    class NormalOperation {

    int value;

        public NormalOperation() {
            value = 0;
        }

        public void IncreamentValue() {
            value++;
        }

        public void DecreamentValue() {
            value--;
        }
    }
