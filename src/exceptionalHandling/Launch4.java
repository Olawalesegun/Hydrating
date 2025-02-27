package exceptionalHandling;


import java.util.Scanner;

class Test{
    public void test_in() throws Exception{
        Scanner scan = new Scanner(System.in);
        try{
            int n = scan.nextInt();
        } catch(Exception e){
            throw new Exception("Exception occurs");
        }

    }
}
public class Launch4 {
    public static void main(String[] args) {
        Test tst = new Test();
        try{
            tst.test_in();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
