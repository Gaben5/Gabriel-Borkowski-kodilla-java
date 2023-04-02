package com.kodilla.rps.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameRPSLS extends AbstractRPS {
    private final Random random = new Random();

    @Override
    public final String select() {
        return "(1) - Rock, \n(2) - Spock, \n(3) - Paper,\n(4) - Lizard, \n(5) - Scissors, \n(x) - leave game, \n(n) - new game";
    }
    @Override
    public final String instruction() {
        return """
                It's very simple. Scissors beats paper.
                Paper beats rock. Rock beats lizard.
                Lizard beats Spock. Spock beats scissors.
                Scissors beats lizard. Lizard beats paper.
                Paper beats Spock. Spock beats rock.
                rock beats scissors.
                Select your weapon:
                """;
    }
    public GameRPSLS(String username, int roundsCount) {
        super(username, roundsCount);
    }
    @Override
    public void userMove(String s) {
        switch (s) {
            case "1", "2", "3", "4", "5" -> {
                int computerMove = random.nextInt(5);
                int i = Integer.parseInt(s) - 1;
                roundWinner(computerMove, i);
            }
            default -> System.out.println("Try again...");
        }
    }
    public void roundWinner(int computerMove, int userMove){
        int result = (computerMove - userMove + 5) % 5;
        System.out.println("You pick: "+ weaponNumber(userMove) + " and computer pick: "+ weaponNumber(computerMove));
        switch (result) {
            case 0 -> {
                incTies();
                System.out.println("Tie");
            }
            case 1, 2 -> {
                incLoses();
                System.out.println("You lose");
            }
            case 3, 4 -> {
                incWins();
                System.out.println("You Win");
            }
        }
    }
    public String weaponNumber(int i){
        Map<Integer,String> wp = new HashMap<>();
        wp.put(0,"Rock");
        wp.put(1,"Spock");
        wp.put(2,"Paper");
        wp.put(3,"Lizard");
        wp.put(4,"Scissors");
        return wp.get(i);
    }
    public String getDescription(){
        return "This is Rock-Paper-Scissors-Lizard-Spock game";
    }

}
