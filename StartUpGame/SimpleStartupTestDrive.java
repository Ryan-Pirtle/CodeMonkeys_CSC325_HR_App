public class SimpleStartupTestDrive {
    
    public static void main(String[] args) {
        Startup dot = new Startup();
        ArrayList<String>[] locations = {"2","3","4"};
        dot.setLocationCells(locations);
        int userGuess = 2;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
//Sets up the game Start up and selects location for the target//
