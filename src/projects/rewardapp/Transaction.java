package projects.rewardapp;

import java.security.SecureRandom;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class Transaction {
    int amountSpent;


    public int spend_money(){
        Random rand = new Random();
        int exp = rand.nextInt(18000) + 2000;
        System.out.println("BO: " + exp);

        return exp;


//        IntStream amount = rand.ints(1, 2000, 20000);
//        amount.forEach(System.out::println);

//        return amount.findFirst().orElse(2000);


    }
}
