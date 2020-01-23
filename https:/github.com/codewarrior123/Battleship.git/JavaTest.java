public class BattleshipTest {

    public static void main(String[] args) {
        Ship game = new Ship();
        int[] locations = {2, 3, 4};
        Game.setLocationCells(locations);
        String userGuess = "2";
        String result = game.checkYourself(userGuess);
        String testResult = "failed";
        if(result.equalsIgnoreCase("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}