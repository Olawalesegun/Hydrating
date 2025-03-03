package threading;

import java.util.Scanner;

class Demo5 implements Runnable {

    @Override
    synchronized public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Activity One Activated");
        System.out.println("Kindly enter your first name");
        sc.nextLine();

        System.out.println("Activity One Ended");
        System.out.println("=============================");
    }
}

class Demo6 implements Runnable {

    @Override
    synchronized public void run() {
        System.out.println("Activity Two Activated");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("Activity Two Ended");
        System.out.println("================================");
    }
}

class Demo7 implements Runnable {

    @Override
    synchronized public void run() {
        System.out.println("Activity Three Activated");
        for(int i= 56; i<62; i++){
            System.out.println((char) i);
        }
        System.out.println("Activity Three Ended");
        System.out.println("================================");
    }
}

public class Launcch {

    public static void main(String[] args) {

        Demo5 d5 = new Demo5();
        Demo6 d6 = new Demo6();
        Demo7 d7 = new Demo7();

        Thread thr = Thread.currentThread();
        String threadName = thr.getName();
        System.out.println("This thread name is: " + threadName);

        Thread d5Thread = new Thread(d5);
        Thread d6Thread = new Thread(d6);
        Thread d7Thread = new Thread(d7);

        d5Thread.start();
        String d5thr = d5Thread.getName();
        System.out.println("The current thread is: " + d5thr);

//        try{
//            d5Thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        d6Thread.start();
        String d6thr = d6Thread.getName();
        System.out.println("The current d6 thread is: " + d6thr);

        d7Thread.start();
        String d7thr = d7Thread.getName();
        System.out.println("The current d7 thread is: " + d7thr);



    }
}
