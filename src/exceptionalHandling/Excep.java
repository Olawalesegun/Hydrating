package exceptionalHandling;

import java.util.Scanner;

public class Excep {
    private int num;
    private int denom;

    public void throw_it() throws ArithmeticException{
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number as Numerator: ");
        try {
            num = scan.nextInt();
            System.out.print("\n");
            System.out.println("Enter a number as a Denominator: ");
            denom = scan.nextInt();
            System.out.println("\n");
            int i = num / denom;
        } catch(ArithmeticException ar) {
            System.out.println("Arithmetic Exception" + ar.getMessage());
            throw new ArithmeticException("You can't make denominator the value zero");
        }
    }

//    public static void main(String[] args) {
//        Excep exc = new Excep();
////        Excep exc1 = exc;
//        exc.throw_it();
//    }
}
