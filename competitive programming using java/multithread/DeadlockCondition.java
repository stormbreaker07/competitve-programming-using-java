import java.util.*;

public class DeadlockCondition {
    
    public static void main(String[] args) {
        RailwayStation railway = new RailwayStation();
        Train1 train1 = new Train1(railway);
        Train2 train2 = new Train2(railway);
        
        Thread thread1 = new Thread(train1);
        Thread thread2 = new Thread(train2);

        thread1.start();
        thread2.start();

    }


    public static class Train2 implements Runnable {

        RailwayStation track;
        public Train2(RailwayStation track) {
            this.track = track;
        }

        @Override
        public void run() {
            Random time = new Random();
            try {
                Thread.sleep(time.nextInt(5));
            }
            catch(InterruptedException e ) {}
            track.takeTrack2();
        }
    }


    public static class Train1 implements Runnable {

        RailwayStation track;
        public Train1(RailwayStation track) {
            this.track = track;
        }

        @Override
        public void run() {
            Random time = new Random();
            try {
                Thread.sleep(time.nextInt(5));
            }
            catch(InterruptedException e ) {}
            track.takeTrack1();
        }
    }


    public static class RailwayStation {
        Object Track1 = new Object();
        Object Track2 = new Object();

        public void takeTrack1() {
            synchronized(Track1) {
                System.out.println("track1 is taken by train " + Thread.currentThread().getName());
            }

            synchronized(Track2) {
                System.out.println("train2 is waiting as track is reserved " + Thread.currentThread().getName());
                try {
                Thread.sleep(1);
                }
                catch(InterruptedException e) {

                }
            }
        }

        public void takeTrack2() {
            synchronized(Track1) {
                System.out.println("track2 is taken by train " + Thread.currentThread().getName());
            }

            synchronized(Track2) {
                System.out.println("train1 is waiting as track is reserved " + Thread.currentThread().getName());
                try {
                Thread.sleep(1);
                }
                catch(InterruptedException e) {

                }
            }
        }

    }



}
