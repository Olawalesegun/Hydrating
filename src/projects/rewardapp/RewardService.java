package projects.rewardapp;

import java.util.ArrayList;
import java.util.Scanner;

public class RewardService {

    public ArrayList<User> users = new ArrayList<User>();

    public void createUser(String _userName){
        User user = new User();
        user.setUserName(_userName);
        users.add(user);
    }

    public boolean checkUsers(){
        for (User usr: users){
            System.out.println(usr.id + " " + usr.userName);
        }
        return false;
    }

    public void check_amount_transacted(int id){
        for(User usr: users){
            if(usr.id == id){
                usr.transact();
                return;
            }
        }
    }

    public static void main(String[] args) {
        RewardService rws = new RewardService();

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly provide your name: ");
        String name = scan.nextLine().trim();

        rws.createUser(name);

        System.out.println(rws.checkUsers());

        rws.check_amount_transacted(1);




    }

}
