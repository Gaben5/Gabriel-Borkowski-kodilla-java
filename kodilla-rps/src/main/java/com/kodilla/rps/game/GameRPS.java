package com.kodilla.rps.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GameRPS extends AbstractRPS {
    private final String description = "This is Rock-Paper-Scissors game";
    private Random random = new Random();


    @Override
    public final String instruction() {
        return "Rock beats scissors, scissors beats paper, paper beats rock";
    }

    @Override
    public final String select() {
        return "(1) - Rock, \n(2) - Paper, \n(3) - Scissors, \n(x) - leave game, \n(n) - new game";
    }

    public GameRPS(String username, int roundsCount) {
        super(username, roundsCount);
    }

    @Override
    public void userMove(String s) {
        switch (s) {
            case "1":
            case "2":
            case "3":
                int computerMove = random.nextInt(3);
                int i = Integer.parseInt(s) - 1;
                roundWinner(computerMove, i);
                break;
            default:
                System.out.println("Try again...");
                break;
        }
    }

    public void roundWinner(int computerMove, int userMove){
        int result =(computerMove - userMove + 3)%3;
        System.out.println("You pick: "+ weaponNumber(userMove) + " and computer pick: "+ weaponNumber(computerMove));
        switch (result){
            case 0 ->{
                incWins();
                System.out.println("Tie");

            }
            case 1 ->{
                incLoses();
                System.out.println("You lose");

            }
            case 2 ->{
                incTies();
                System.out.println("You win");

            }

        }
    }

    public String weaponNumber(int i){
        Map<Integer,String> nw = new HashMap<>();
        nw.put(0,"Rock");
        nw.put(1,"Paper");
        nw.put(2,"Scissors");
        return nw.get(i);
    }

    public String getDescription() {
        return description;
    }
}
