package projects.rewardapp;

public class User {
    int id;
    String userName;
    int points_earned;
    String[] coupon_earned;

    public void setUserName(String _userName){
        this.userName = _userName;
        this.id++;
    }

    public String getUserName() {
        return userName;
    }

    public int transact(){
        Transaction tx = new Transaction();
        return tx.spend_money();
//        System.out.println(this.userName + " spent " + tx.spend_money());
    }

    public void convert_amount_to_points(int amount_spent){
        float points = (float) amount_spent /100;
        this.points_earned += points;
    }


}
