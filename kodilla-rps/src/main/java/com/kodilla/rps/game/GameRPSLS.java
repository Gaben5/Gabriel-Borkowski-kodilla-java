package com.kodilla.rps.game;

import java.util.HashMap;
import java.util.Map;

public class GameRPSLS extends GameAbstractClass {
    private static final String description = "This is Rock-Paper-Scissors-Lizard-Spock game";

    @Override
    public final String select() {
        return "(1) - Rock, \n(2) - Spock, \n(3) - Paper,\n(4) - Lizard, \n(5) - Scissors, \n(x) - leave game, \n(n) - new game";
    }

    @Override
    public final String instruction() {
        return "It's very simple. Scissors beats paper.\n" +
                "Paper beats rock. Rock beats lizard.\n" +
                "Lizard beats Spock. Spock beats scissors.\n" +
                "Scissors beats lizard. Lizard beats paper.\n" +
                "Paper beats Spock. Spock beats rock.\n" +
                "rock beats scissors.\n" +
                "Select your weapon:\n";
                /*"(1) Rock\n" +
                "(2) Spock\n" +
                "(3) paper\n" +
                "(4) Lizard\n" +
                "(5) Scissors" ;*/
    }


    public GameRPSLS(String username, int roundsCount) {
        super(username, roundsCount);
    }

    @Override
    public void userMove(String s) {
        switch (s) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                int computerMove = random.nextInt(5);
                int i = Integer.parseInt(s) - 1;
                roundWinner(computerMove, i);
                break;
            default:
                System.out.println("Try again...");
                break;
        }
    }
    public void roundWinner(int computerMove, int userMove){
        int result = (computerMove - userMove + 5) % 5;
        System.out.println("You pick: "+numberWeapon(userMove) + " and computer pick: "+numberWeapon(computerMove));
        switch (result){
            case 0:
                ties++;
                System.out.println("Tie");
                break;
            case 1:
            case 2:
                loses++;
                System.out.println("You lose");
                break;
            case 3:
            case 4:
                wins++;
                System.out.println("You Win");
                break;
        }
    }
    public String numberWeapon(int i){
        Map<Integer,String> wp = new HashMap<>();
        wp.put(0,"Rock");
        wp.put(1,"Spock");
        wp.put(2,"Paper");
        wp.put(3,"Lizard");
        wp.put(4,"Scissors");
        return wp.get(i);
    }

    public static String getDescription(){
        return description;
    }

}
