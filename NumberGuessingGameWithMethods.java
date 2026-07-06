import java.util.Scanner;

//generateSecretNumber()
//getGuessFromUser()
//checkGuess(int guess, int secret)
//printResult(int attempts)

public class NumberGuessingGameWithMethods{
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    boolean isCorrect=false;
    int secret = generateSecretNumber();
    int attempts = 0;

    while (isCorrect==false){      
      int guess = getGuessFromUser();
      attempts++;
      isCorrect = checkGuess(guess,secret);

    }

    System.out.println("You got in "+printResult(attempts)+" guesses");

    scanner.close();
  }

  public static int generateSecretNumber(){
    return (int)(Math.random()*100)+1;
  }

  public static int getGuessFromUser(){
    return scanner.nextInt();
  }

  public static boolean checkGuess(int guess, int secret){
    if (guess>secret){
        System.out.println("Too high");
        return false;
      } else if (guess<secret){
        System.out.println("Too low");
        return false;
      } else {
        System.out.println("You got it correct");
        return true;
      }
  }

  public static int printResult(int attempts){
    return attempts;
  }
}