import java.util.Scanner;


//getFizzBuzz(int number) returns Fizz -> / by 3, Buzz -> /5, FizzBuzz if both, otherwise number as String

public class FizzBuzz{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type a number");
    int input = scanner.nextInt();
    isEven(input);
    getFizzBuzz(input);
    scanner.close();
  }

  public static void isEven(int number){
    if (number%2==0){
    System.out.println(true);
  } else {System.out.println(false);}
  }

  public static void getFizzBuzz(int number){
    if (number%3==0&&number%5==0){
      System.out.println("FizzBuzz");
    } else if (number%5==0){
      System.out.println("Buzz");
    } else if (number%3==0){
      System.out.println("Fizz");
    } else {
      String value = Integer.toString(number);
      System.out.println(value);
    }
  }
}