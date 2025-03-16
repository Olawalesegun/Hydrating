package projects.rewardapp.excep;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String _msg){
        super(_msg);
    }
}
