public class Test {
  public static void main(String[] args) {
  //variable for guesses
    int numOfGuesses =0;
    //made a class t write the method for user input
    GameHelper helper = new GameHelper();
    //made a dotCom object
    SampleDotCom theDotCom = new SampleDotCom();
    //random number for location of arrays
    int randomNum = (int) (Math.random()*5);
    int[] locations = (randomNum,randomNum+1,randomNum+2);	
   //gaive the dotcom object its location 
    theDotCom.setLocationCells(locations);
    //set boolean to check weather a game is alive or not
    boolean isAlive = true;
    where(isAlive == true){
    //get user input
    	String guess = helper.getUserInput("enter the number");
        //ask dotcom to check guess 
        String result = theDotCom.checkYourself(guess);
        numOfGuess++;
        if(result.equals("kill")){
        // if kill then come out of loop
        	isAlive = false;
            System.out.println("Yot took " + numOfGuess+" guesses");
        }
    }
  }
}
