package projects.rewardapp;

import projects.rewardapp.excep.EmptyStringException;
import projects.rewardapp.excep.NameLengthException;
import projects.rewardapp.excep.UserNotRegisteredException;
import projects.rewardapp.excep.WrongPasswordException;

import java.util.ArrayList;
import java.util.Scanner;

public class RewardService {

    public ArrayList<User> users = new ArrayList<User>();

    enum Categories {
        ELECTRONICS, GROCERY, CLOTHING, NONE
    }

    public void createUser() {
        User user = new User();
        Scanner scn = new Scanner(System.in);
        try (scn) {
            System.out.println("Kindly enter your first name");
            String _firstName = scn.nextLine().trim();
            System.out.println("Kindly enter your last name:");
            String _lastName = scn.nextLine().trim();
            System.out.println("Kindly enter your password");
            String _passwd = scn.nextLine().trim();
            user.register(_firstName, _lastName, _passwd);
            users.add(user);
        } catch (EmptyStringException | NameLengthException | WrongPasswordException excp) {
            System.out.println(excp.getMessage());
        }
    }

    public void logIntoApp(){
        try {
            User usr = new User();
            Scanner scn = new Scanner(System.in);
            System.out.println("Kindly enter your userName: ");
            String usrName = scn.nextLine().trim();
            System.out.println("Kindly enter your password");
            String passwd = scn.nextLine().trim();

            usr.signIn(usrName, passwd);
        }catch(UserNotRegisteredException | WrongPasswordException exc){
            System.out.println(exc.getMessage());
        }
    }

    public boolean checkUsers(){
        for (User usr: users){
            System.out.println(usr.id + " " + usr.userName);
        }
        return false;
    }

    public int check_amount_transacted(int id){
        int amount_transacted;
        for(User usr: users){
            if(usr.id == id){
                try{
                    amount_transacted = usr.transact();
                } catch (UserNotRegisteredException | WrongPasswordException usr) {
                    System.out.println(usr.getMessage());
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        RewardService rws = new RewardService();

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly provide your name: ");
        String name = scan.nextLine().trim();

        rws.createUser(name);

        System.out.println(rws.checkUsers());

        int amount = rws.check_amount_transacted(1);
    }

    public Enum check_category(){
        System.out.println("Kindly select a number to choose a Category of product you want to pick from: \n" +
                "1. Electronics \n" +
                "2. Grocery \n" +
                "3. Clothing ");
        return select_category();

    }

    public Enum select_category(){
        Scanner scn = new Scanner(System.in);
        int valEntered = scn.nextInt();

        if(valEntered == 1){
            return Categories.ELECTRONICS;
        }
        else if(valEntered == 2){
            return Categories.GROCERY;
        }
        else if(valEntered == 3){
            return Categories.CLOTHING;
        }

        return Categories.NONE;
    }

    public void confirm_if_user_can(User usr){
        Enum enVal = check_category();

        if(enVal.equals(Categories.ELECTRONICS)){
            int amount = check_amount_transacted(usr.id);
            if(amount >= 20000){
                usr.convert_amount_to_points(amount);
                int pointsEarned = usr.getPoints_earned();


            } else {

            }
        } else if (enVal.equals(Categories.GROCERY)) {
            int amount = check_amount_transacted(usr.id);
            if(amount < 10000){
                usr
            }

        }
    }

}
