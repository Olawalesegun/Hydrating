package exceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {

    public void go_to_school(){
        System.out.println("Hello enter your Name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Kindly enter your age");
        int age = 0;
        try{
            age = scan.nextInt();
        } catch(InputMismatchException i){
            System.out.println("Wrong input given");
            System.out.println("ToString " + i.toString());
            System.out.println("Get Message " + i.getMessage());
            System.out.println("STACK TRACE" + i.getStackTrace());
        }
        System.out.println("Student name is: " + name + " and age is: " + age);
    }
}
