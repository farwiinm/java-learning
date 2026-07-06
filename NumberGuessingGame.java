import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args){
    int secret = (int)(Math.random()*100)+1;
    boolean gotCorrect = false;
    Scanner scanner = new Scanner(System.in);
    int guesses=0;

    while (gotCorrect == false){
      System.out.println("Enter your guess:");
      int guess = scanner.nextInt();

      if (guess>secret){
        guesses++;
        System.out.println("Too high");
      } else if (guess<secret){
        System.out.println("Too low");
      } else {
        gotCorrect=true;
        System.out.println("You got it in "+guesses+" guesses");
      }
    }
      
    scanner.close();

  }
}