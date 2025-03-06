package threading;

class MeTh1 implements Runnable {

    public void run() {
        try{
            System.out.println("This is basically trying to understand synchronize better!!");
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName() + " 1st encounter!!");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " is currently in play! for 2nd!");
            }
        }catch(Exception exc){
            System.out.println("This exception is :: " + exc.getMessage());
        }

    }
}

public class MeThread2 {
    public static void main(String[] args) {
        MeTh1 meth = new MeTh1();

        Thread thr1 = new Thread(meth);
        Thread thr2 = new Thread(meth);
        Thread thr3 = new Thread(meth);

        thr1.setName("Meth One");
        thr2.setName("Meth Two");
        thr3.setName("Meth Three");

        thr1.start();
        thr2.start();
        thr3.start();
    }
}
