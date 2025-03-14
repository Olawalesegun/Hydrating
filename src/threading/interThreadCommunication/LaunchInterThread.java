package threading.interThreadCommunication;

class Producer implements Runnable {

    Q q;
    public Producer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
            try{
                Thread.sleep(5000);
            }catch(Exception e){

            }
        }
    }
}
class Consumer implements Runnable {
    Q q;
    public Consumer(Q q){
        this.q = q;
        Thread thr = new Thread(this, "Consumer");
        thr.start();
    }

    @Override
    public void run() {

        while(true){
            q.get();
            try{
                Thread.sleep(5000);
            }catch(Exception e){

            }
        }
    }

}

class Q {
    int no;
    boolean valueSet = false;

    public synchronized void put(int n){
        while(valueSet){
            try{
                wait();
            }catch(Exception e){}
        }
        this.no = n;
        System.out.println("put no: " + no);
        valueSet = true;
        notify();
    }

    public synchronized void get(){
        while(!valueSet){
            try{
                wait();
            }catch(Exception e){}
        }
        System.out.println("get no: " + no);
        valueSet = false;
        notify();
    }
}
public class LaunchInterThread {
    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);
    }
}
