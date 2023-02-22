package com.kodilla.rps;

import com.kodilla.rps.game.GameAbstractClass;
import com.kodilla.rps.game.GameRPS;
import com.kodilla.rps.game.GameRPSLS;

public class RpsRunner {
    private static String selectName(){
        System.out.println("Select your nick");
        return GameAbstractClass.scanner.next();
    }
    private static int roundsNumber(String username){
        System.out.println("Hello "+ username + " how many rounds would you like to play ?");
        while (!GameAbstractClass.scanner.hasNextInt()) {
            GameAbstractClass.scanner.next();
            System.out.println("Select number of rounds");
        }
        return GameAbstractClass.scanner.nextInt();
    }
    private static GameAbstractClass chooseGame(String name, int roundsCount) {
        boolean end = false;
        GameAbstractClass theGame = null;
        String numberGame;
        while(!end) {
            System.out.println("Pick the game (1) Rock-Paper-Scissors ; (2) Rock-Paper-Scissors-Lizard-Spock");
            numberGame = GameAbstractClass.scanner.next();
            switch (numberGame){
                case "1" ->{
                    System.out.println(GameRPS.getDescription());
                    theGame = new GameRPS(name,roundsCount);
                    end = true;
                }
                case "2" ->{
                    System.out.println(GameRPSLS.getDescription());
                    theGame = new GameRPSLS(name,roundsCount);
                    end = true;
                }
            }
        }
        return theGame;
    }
    private static void runGame(String userName, GameAbstractClass game){
        boolean end = false;
        System.out.println(game.instruction());
        while (!end){
            System.out.println(game.select());
            String s = GameAbstractClass.scanner.next();
            game.chooseWeapon(s);
            game.isNextRound();
            end = game.isEnd();
        }
    }

    public static void main(String[] args) {
        final String name = selectName();
        final int roundsCount = roundsNumber(name);

        GameAbstractClass newGame = chooseGame(name,roundsCount);
        runGame(name,newGame);
    }
}
