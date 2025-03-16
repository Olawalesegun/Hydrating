package projects.rewardapp;

//import org.mindrot.jbcrypt.BCrypt;
import projects.rewardapp.excep.EmptyStringException;
import projects.rewardapp.excep.NameLengthException;
import projects.rewardapp.excep.UserNotRegisteredException;
import projects.rewardapp.excep.WrongPasswordException;

import java.util.Scanner;

public class User {
    private static int nextId = 1;
    int id;
    String fullName;
    String userName;
    String pwd;
    boolean isRegistered = false;
    boolean isSignedIn = false;

    int points_earned;
    String[] coupon_earned;
    Transaction tx;

//    public void setUserName(String _userName) {
//        this.userName = _userName;
//        this.id++;
//    }
    public void setPassword(String _passwd){
        this.pwd = _passwd;
    }

    public User(){
        id = nextId++;
    }

    public void register(String _firstName, String _lastName, String _password)
            throws EmptyStringException, NameLengthException, WrongPasswordException  {

        if (_firstName.isEmpty() || _lastName.isEmpty()) {
            throw new EmptyStringException("You have not provided any name");
        }

        if (_firstName.length() <= 3 || _lastName.length() <= 3) {
            throw new NameLengthException("Name Cannot be 3 or less than 3");
        }

        if (_password.isEmpty()) {
            throw new EmptyStringException("Password is Empty");
        }

        if (_password.length() < 8) {
            throw new NameLengthException("Password must be at least 8 characters");
        }

        String confirmPasswd = enter_password();

        if (!confirmPasswd.equals(_password)) {
            throw new WrongPasswordException("Password do not match!!!");
        }

        this.fullName = _firstName + " " + _lastName;
        this.userName = _firstName.toLowerCase() + this.id;
        setPassword(_password);
        System.out.println("The userName created is: " + this.userName);
        isRegistered = true;
    }

    public String enter_password() {
        String str = " ";
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Kindly re-enter the password one more time for confirmation: ");
            str = scan.nextLine().trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return str;
    }

    public String getUserName(int id) {
        String user_name = "";
        if (this.id == id) {
            user_name = this.userName;
        }
        return user_name;
    }

    public boolean signIn(String _userName, String _password) throws UserNotRegisteredException, WrongPasswordException {
        boolean status = false;
        if(!this.isRegistered) throw new UserNotRegisteredException("User not registered!");
        if (this.userName.equals(_userName) && this.pwd.equals(_password)) {
            status = true;
            this.isSignedIn = true;
        } else {
            throw new WrongPasswordException("Either Wrong userName or Password Detected!!!");
        }
        return status;
    }

    public String getUserName() {
        return this.userName;
    }

    public int transact() throws UserNotRegisteredException, WrongPasswordException {
        if (this.isRegistered && this.isSignedIn) {
            tx = new Transaction();
            return tx.spend_money();
        } else {
            throw new UserNotRegisteredException("This User is either not Registered nor Signed in");

//        System.out.println(this.userName + " spent " + tx.spend_money());
        }
    }

    public void convert_amount_to_points (int amountSpent){
        int points = amountSpent / 100;
        this.points_earned += points;
    }

    public int getPointsEarned(int id){
        return this.points_earned;
    }




//    public void hashPassword(String password){
//        BCrypt
//    }
}
