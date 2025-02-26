package exceptionalHandling;

import java.util.Scanner;

class LengthNotEqualException extends Exception {
    public LengthNotEqualException(String msg){
        super(msg);
    }
}

class NotSameAccountException extends Exception {
    public NotSameAccountException(String msg){
        super(msg);
    }
}

public class ATM {
    private String userAcc = "0011223344";
    private String pwd = "00001111";
    private String accountNum = "";
    private String password;

    public void enter_details(Scanner sc){
        sc = new Scanner(System.in);
        System.out.println("Enter your 10 digit");
        accountNum = sc.nextLine();

        System.out.println("Kindly enter your password: ");
        password = sc.nextLine();
    }

    public void verify() throws Exception{
        if(accountNum.length() != (userAcc.length())){
            throw new LengthNotEqualException("You have inputted incorrect length of account");
        }

        if(!accountNum.equals(userAcc)){
            throw new NotSameAccountException("This account does not exist on our server");
        }
    }

    public void launchAtm(){
        Scanner sc = new Scanner(System.in);
        try{
            enter_details(sc);
            verify();
            System.out.println("Login successful");
        } catch (Exception e) {
            System.out.println("Wrong Details entered, you have one more attempt.");
            try{
//                System.out.println("Wrong details entered");
                enter_details(sc);
                verify();
                System.out.println("Congratulations::Now::Logged::IN");
            } catch(Exception ef){
                System.out.println(ef.getMessage());
                System.out.println("Account::Blocked");
            }

        }
        finally {
            sc.close();
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.launchAtm();
    }
}
