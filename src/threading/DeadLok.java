package threading;

class Dl implements Runnable{
    private final String subj = "Java";
    private final String subj2 = "Python";
    private final String subj3 = "C++";

    public void run(){

        String tName = Thread.currentThread().getName();
        if("Student1".equals(tName)){
            try{
                System.out.println("The fun begins for everyone");
                synchronized(subj){
                    System.out.println(tName + " is with " + subj);
                    Thread.sleep(5000);
                    synchronized(subj2){
                        System.out.println(tName + " is now with "+ subj + " and " + subj2);
                        Thread.sleep(5000);
                        synchronized (subj3){
                            System.out.println(tName + " is now with " + subj + ", " + subj2 +
                                    " and " + subj3);
                            Thread.sleep(5000);
                        }
                    }
                }
            }catch (Exception ex){
                System.out.println("Exception observed for: "+ tName + " with " + ex.getMessage());
            }
        }else if("Student2".equals(tName)){
            try{
                System.out.println("The fun begins for everyone");
                synchronized(subj){
                    System.out.println(tName + " is with " + subj);
                    Thread.sleep(5000);
                    synchronized(subj2){
                        System.out.println(tName + " is now with "+ subj + " and " + subj2);
                        Thread.sleep(5000);
                        synchronized (subj3){
                            System.out.println(tName + " is now with " + subj + ", " + subj2 +
                                    " and " + subj3);
                            Thread.sleep(5000);
                        }
                    }
                }
            }catch (Exception ex){
                System.out.println("Exception observed for: "+ tName + " with " + ex.getMessage());
            }
        } else {
            try{
                System.out.println("The fun begins for everyone");
                synchronized(subj){
                    System.out.println(tName + " is with " + subj);
                    Thread.sleep(5000);
                    synchronized(subj2){
                        System.out.println(tName + " is now with " + subj + " and " + subj2);
                        Thread.sleep(5000);
                        synchronized (subj3){
                            System.out.println(tName + " is now with " + subj + ", " + subj2 +
                                    " and " + subj3);
                            Thread.sleep(5000);
                        }
                    }
                }
            }catch (Exception ex){
                System.out.println("Exception observed for: "+ tName + " with " + ex.getMessage());
            }
        }
    }
}

public class DeadLok {

    public static void main(String[] args) {
        Dl dl = new Dl();

        Thread thr = new Thread(dl);
        Thread thr2 = new Thread(dl);
        Thread thr3 = new Thread(dl);

        thr.setName("Student1");
        thr2.setName("Student2");
        thr3.setName("Student3");

        thr.start();
        thr2.start();
        thr3.start();
    }
}
