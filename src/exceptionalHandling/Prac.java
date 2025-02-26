package exceptionalHandling;

import java.util.Scanner;

public class Prac {

    private int num1;
    private int num2;
    public void printt() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a student age: ");
        num1 = sc.nextInt();

        System.out.println("Enter a student number of course: ");
        num2 = sc.nextInt();
        System.out.println(num1 + " ::: " + num2);
    }
}
