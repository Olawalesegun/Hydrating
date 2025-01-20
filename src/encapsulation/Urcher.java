package encapsulation;

import java.util.Scanner;
public class Urcher {

    private int guessedNum;
    private int player1_guessedNum;
    private int player2_guessedNum;
    private int player3_guessedNum;

    public void setguessedNum(int guessedNum) {
        this.guessedNum = guessedNum;
    }

    public void setPlayer1GuessedNum(int num) {
        this.player1_guessedNum = num;
    }

    public void setPlayer2GuessedNum(int num) {
        this.player2_guessedNum = num;
    }

    public void setPlayer3GuessedNum(int num) {
        this.player3_guessedNum = num;
    }

    public void launchIt() {
        Scanner scan = new Scanner(System.in);
        Guesser guesser;
        guesser = new Guesser();
        Player player1 = new Player();
        Player player2 = new Player();
//		encapsulation.Player player3 = new encapsulation.Player();

        System.out.println("Enter the Value to Start the Game Sir");


        int guessedNum = scan.nextInt();
        guesser.setGuessedNum(guessedNum);
//		int valueEntered = guesser.getGuessedNum();

        System.out.println(" Hello, you're welcome.\n"
                + "Start the Challenge, by Guessing a number"
                + "\n"
                + "----------------------------------\n"
                + "-------------------------------------\n"
                + "        / \"\n"
                + "        / \"\n"
                + "        /\"");


        System.out.println("Hi Player1, kindly write your name below:");
        scan.nextLine();
        String name = scan.nextLine();
        player1.setName(name);
        String player1Name = player1.getName();
        if(player1Name == null) {
            name = scan.nextLine();
        }

        System.out.println("Hi " + name + ", kindly guess the number now");

        int player1_value = scan.nextInt();
        player1.setGuessedNum(player1_value);
        setPlayer1GuessedNum(player1_value);


        System.out.println("------------------------------------------------------");

        System.out.println("encapsulation.Player 2 can now play!! Kindly Enter Your name.");
        scan.nextLine();
        String name2 = scan.nextLine();
        player2.setName(name2);
        String player2Name = player2.getName();

        System.out.println(" Hi " + name2 + ", kindly guess the number now");

        int player2_value = scan.nextInt();
        player2.setGuessedNum(player2_value);
        setPlayer1GuessedNum(player2_value);


        if(player1_value == guessedNum && player2_value == guessedNum) {
            System.out.println("Nobody Won, and this is because there was a tie!!!");
        }
        else if(player1_value == guessedNum) {
            System.out.println(player1Name + "won");
        }
        else {
            System.out.println("=========================================");
            System.out.println("  The winner of the game is: " + player2Name);
            System.out.println("=========================================");
        }
        scan.close();
    }

}
