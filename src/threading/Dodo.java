package threading;

class Do1 implements Runnable {
    synchronized public void run(){
        System.out.println("Running this for Thread: " + Thread.currentThread().getName());
        try{
            System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " is using the bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " has exited the bathroom");
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted!!!");
        }
        finally {
            System.out.println(Thread.currentThread().getName() + " has finished running");
        }
    }
}

public class Dodo {
    public static void main(String[] args) throws InterruptedException {
        Do1 d1 = new Do1();
//        Do1 d2 = new Do1();
//        Do1 d3 = new Do1();

        Thread thr = new Thread(d1);
        Thread thrr = new Thread(d1);
        Thread thrrr = new Thread(d1);

        thr.start();
        thrr.start();
        thrrr.start();

    }
}
