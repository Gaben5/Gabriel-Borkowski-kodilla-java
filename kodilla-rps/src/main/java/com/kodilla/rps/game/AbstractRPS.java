package com.kodilla.rps.game;

import com.kodilla.rps.RpsRunner;

import java.util.Random;
import java.util.Scanner;

public abstract class AbstractRPS {
    private final String username;
    private final int roundsCount;
    private int wins = 0;
    private int loses = 0;
    private int ties = 0;
    private boolean end = false;
    public abstract String instruction();
    public abstract String select();
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    public void isNextRound(){
        if (wins+loses+ties >=roundsCount)matchWinner();
    }
    public void incWins(){
        wins++;
    }
    public void incLoses(){
        loses++;
    }
    public void incTies(){
        ties++;
    }
    public void matchWinner(){
        setEnd(true);
        int result = getWins() - getLoses();
        System.out.println("Game over");
        System.out.println("Your Score: Wins: "+ getWins() + " losees: " + getLoses() + " tie: " +getTies());
        if (result > 0) System.out.println("You are the winner!!");
        else if (result < 0) System.out.println("You lose the game");
        else System.out.println("Tie!!");
    }

    public void chooseWeapon(String s){
        switch (s) {
            case "x" -> {
                System.out.println("Are you sure? (y) - yes ; (n) - no");
                s = scanner.next();
                if (s.equals("y")) {
                    System.out.println("Bye..");
                    setEnd(true);
                }
            }
            case "n" -> {
                System.out.println("Are you sure ? - (y) - yes");
                s = scanner.next();
                if (s.equals("y")) {
                    System.out.println("Let's try again");
                    setEnd(true);
                    RpsRunner.main(new String[0]);
                }
            }
            case "1", "2", "3", "4", "5" -> userMove(s);
            default -> {
                System.out.println("Try again");
            }
        }
    }
    public AbstractRPS(String username, int roundsCount) {
        this.username = username;
        this.roundsCount = roundsCount;
    }
    abstract void userMove(String s);

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getTies() {
        return ties;
    }
    public boolean isEnd(){
        return end;
    }
    public void setEnd(boolean end){
        this.end = end;
    }


}