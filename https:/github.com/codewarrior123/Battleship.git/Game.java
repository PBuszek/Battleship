



public class Game {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        Scanner keyboard = new Scanner(System.in);
        Ship theShip = new Ship();
        int[] randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theShip.setLocationCells(locations);
        boolean isAlive = true;
        while(isAlive){
            System.out.print("Enter a number: ");
            String guess = keyboard.nextLine();
            String result = theShip.checkYourself(guess);
            numOfGuesses++;
            if(result.equalsIgnoreCase(("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }
    }
}