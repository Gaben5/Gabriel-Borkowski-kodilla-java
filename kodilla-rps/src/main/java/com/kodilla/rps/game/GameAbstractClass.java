package com.kodilla.rps.game;

import com.kodilla.rps.RpsRunner;

import java.util.Random;
import java.util.Scanner;

public abstract class GameAbstractClass {
    String username;
    int roundsCount;
    int wins = 0;
    int loses = 0;
    int ties = 0;
    boolean end = false;
    public abstract String instruction();
    public abstract String select();
    public void isNextRound(){
        if (wins+loses+ties >=roundsCount)matchWinner();
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

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public void chooseWeapon(String s){
        switch (s) {
            case "x":{
                System.out.println("Are you sure? (y) - yes ; (n) - no");
                s =scanner.next();
                if (s.equals("y")){
                    System.out.println("Bye..");
                    setEnd(true);
                }
            }
            break;
            case "n" :{
                System.out.println("Are you sure ? - (y) - yes");
                s = scanner.next();
                if (s.equals("y")){
                    System.out.println("Let's try again");
                    setEnd(true);
                    RpsRunner.main(new String[0]);
                }
            }
            break;
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                userMove(s);
                break;
            default : {
                System.out.println("Try again");
                break;
            }
        }
    }



    public GameAbstractClass(String username, int roundsCount) {
        this.username = username;
        this.roundsCount = roundsCount;
    }
    public abstract void userMove(String s);

    public String getUsername() {
        return username;
    }

    public int getRoundsCount() {
        return roundsCount;
    }

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