import java.util.*;


public class Example3 {

        private static final int MAX_PASSWORD = 9999;


        public static void main(String[] args) {

            Random random = new Random();
            vault Vault = new vault(random.nextInt(MAX_PASSWORD));

            ArrayList<Thread> threadList = new ArrayList<>();

            threadList.add(new AscendingHackerThread(Vault));
            threadList.add(new DescendingHackerThread(Vault));
            threadList.add(new PoliceThread());

            for(Thread thread : threadList) {
                thread.start();
            }
        }

        private static class vault {
            private int password;

            public vault(int password) {
                this.password = password;
            }

            public boolean isCorrectPassword(int password) {
                try {
                    Thread.sleep(5);
                }
                catch( InterruptedException e) {

                }
                return this.password==password;
            }
        }

        private static abstract class HackerThread extends Thread {
            public  vault Vault;

            public HackerThread(vault Vault) {
                this.Vault = Vault;
                this.setName(this.getClass().getSimpleName());
                this.setPriority(Thread.MAX_PRIORITY);
            }

            public void start() {
                System.out.println("the thread is started" + this.getName());
            }

        }


        private static class AscendingHackerThread extends HackerThread {

            public AscendingHackerThread(vault Vault) {
                super(Vault);
            }

            public void run() {
                for(int guess = 0 ; guess<MAX_PASSWORD ;guess++) {
                    if(Vault.isCorrectPassword(guess)) {
                        System.out.println("password correct");
                        System.exit(0);
                    }
                }
             }
        }

        private static class DescendingHackerThread extends HackerThread {

            public DescendingHackerThread(vault Vault) {
                super(Vault);
            }

            public void run() {
                for(int guess=MAX_PASSWORD ;guess>=0;guess--) {
                    if(Vault.isCorrectPassword(guess)) {
                        System.out.println("password correct");
                        System.exit(0);
                    }
                }
            }
        }



        private static class PoliceThread extends Thread {
            public void run() {
                System.out.println("policeman thread in running");
                for(int i=0;i<10;i++)
                {
                    try {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e) {

                    }
                    System.out.println(i);
                }

                System.out.println("the hackers game is over");
                System.exit(0);
            }
        }
}