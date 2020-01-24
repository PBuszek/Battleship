
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Scanner keyboard = new Scanner(System.in);
    private ArrayList<Ship> listOfShips = new ArrayList<Ship>();
    private int numOfGuesses = 0;
    private GameHelper helper = new GameHelper();

    private void setUpGame(){
        Ship shipOne = new Ship();
        shipOne.setName("Bismarck");
        Ship shipTwo = new Ship();
        shipOne.setName("Yamato");
        Ship shipThree = new Ship();
        shipOne.setName("Missouri");

        listOfShips.add(shipOne);
        listOfShips.add(shipTwo);
        listOfShips.add(shipThree);

        System.out.println("Your goal is to sink three Ships.");
        System.out.println("Bismarck, Yamato, Missouri");
        System.out.println("Try to sink them in the fewest guesses.");

        for(Ship ship : listOfShips){
            ArrayList<String> location = helper.placeShip(3);
            ship.setLocationCells((location));
        }
    }
    private void startPlaying(){
        while(!listOfShips.isEmpty()){
            String userGuess = getUserInput();
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";
        for (Ship ship : listOfShips){
            result = ship.checkYourself(userGuess);
            if(result.equalsIgnoreCase("Hit")){
                break;
            }
            if(result.equalsIgnoreCase("Kill")){
                listOfShips.remove(ship);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All ships have been sunk!");
        if(numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("Have you tought about joining the Navy?");
        }else{
            System.out.println("Took you long enought. " + numOfGuesses + " guesses.");
        }
    }
    private String getUserInput(){
        String guess = keyboard.nextLine();
        return guess;
    }

    public static void main(String[] args){
        Game game = new Game();
        game.setupGame();
        game.startPlaying();
    }
}
