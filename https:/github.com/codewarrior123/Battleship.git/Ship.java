
class Ship {
    private int[] locationCells;
    private int numOfHits;

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell : locationCells){
            if(guess == cell){
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.lenght){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
    public void setLocationCells(int[] locations){
        this.locationCells = locations;
    }
}