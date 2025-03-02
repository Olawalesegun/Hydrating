package threading;

class Demo5 implements Runnable {

    @Override
    public void run() {
        System.out.println("Activity Two Activated");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("Activity Two Ended");
    }
}

class Demo6 implements Runnable {

    @Override
    public void run() {
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
    public void run() {
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
        thr.getName();



    }
}
