package threading;

import java.util.Scanner;

class Demo2 extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Activity One Activated");
        System.out.println("Kindly enter your first name");
        sc.nextLine();

        System.out.println("Activity One Ended");
        System.out.println("=============================");
    }
}
class Demo3 extends Thread {
    public void run(){
        System.out.println("Activity Two Activated");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("Activity Two Ended");
        System.out.println("================================");
    }
}
class Demo4 extends Thread {
    public void run(){
        System.out.println("Activity Three Activated");
        for(int i= 56; i<62; i++){
            System.out.println((char) i);
        }
        System.out.println("Activity Three Ended");
    }
}
public class Demo {

    public void run_demo(){

        System.out.println("Activity Two Activated");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("Activity Two Ended");

        System.out.println("Activity Two Activated");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("Activity Two Ended");
        System.out.println("================================");

        System.out.println("Activity Three Activated");
        for(int i= 56; i<62; i++){
            System.out.println((char) i);
        }
        System.out.println("Activity Three Ended");

    }

    public static void main(String[] args) {
//        Demo dem = new Demo();
//        dem.run_demo();

        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();
        Demo4 d4 = new Demo4();

        d2.start();
        d3.start();
        d4.start();
    }
}
