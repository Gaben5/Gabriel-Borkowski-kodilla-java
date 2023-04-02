package com.kodilla.rps;

import com.kodilla.rps.game.AbstractRPS;
import com.kodilla.rps.game.GameRPS;
import com.kodilla.rps.game.GameRPSLS;

import java.util.Scanner;

public class RpsRunner {
    private final Scanner scanner = new Scanner(System.in);
    private String selectName(){
        System.out.println("Select your nick");
        return scanner.next();
    }
    private int roundsNumber(String username){
        System.out.println("Hello "+ username + " how many rounds would you like to play ?");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Select number of rounds");
        }
        return scanner.nextInt();
    }
    private AbstractRPS chooseGame(String name, int roundsCount) {
        GameRPS gameRPS = new GameRPS(name,roundsCount);
        GameRPSLS gameRPSLS = new GameRPSLS(name,roundsCount);
        String gameNumber;
        while(true) {
            System.out.println("Pick the game (1) Rock-Paper-Scissors ; (2) Rock-Paper-Scissors-Lizard-Spock");
            gameNumber = scanner.next();
            switch (gameNumber){
                case "1" ->{
                    System.out.println(gameRPS.getDescription());
                    return gameRPS;
                }
                case "2" ->{
                    System.out.println(gameRPSLS.getDescription());
                    return gameRPSLS;
                }
            }
        }
    }
    private void runGame(AbstractRPS game){
        boolean end = false;
        System.out.println(game.instruction());
        while (!end){
            System.out.println(game.select());
            String s = scanner.next();
            game.chooseWeapon(s);
            game.isNextRound();
            end = game.isEnd();
        }
    }
    private void startGame(){
        final String name = selectName();
        final int roundsCount = roundsNumber(name);

        AbstractRPS newGame = chooseGame(name,roundsCount);
        runGame(newGame);
    }

    public static void main(String[] args) {
        new RpsRunner().startGame();
    }
}
