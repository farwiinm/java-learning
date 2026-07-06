import java.util.Scanner;

public class Calculator{
  public static void main(String[] args){
    //add(int a, int b)
    //subtract(int a,int b)
    //multiply(int a, int b)
    //divide(double a, double b)
    //Overload add to also handle 2 doubles and 3 integers
    //call all version from main and print results
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type one of: +, -, *, /");
    char operation = scanner.next().charAt(0);

    if (operation == '+'){
      System.out.println("How many values do you want to add? Type either 2 or 3");
      int freq = scanner.nextInt();

      if (freq==2){        
        System.out.println("Do you want to add (1) Integers or (2) Decimals? Type 1 or 2");
        int type = scanner.nextInt();

        if (type == 1){
          System.out.println("Enter first number: ");
          int a = scanner.nextInt();

          System.out.println("Enter second number: ");
          int b = scanner.nextInt();

          System.out.println(add(a,b));
        } else {
          System.out.println("Enter first number: ");
          double a = scanner.nextDouble();

          System.out.println("Enter second number: ");
          double b = scanner.nextDouble();

          System.out.println(add(a,b));
        }
        
      } else {
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int c = scanner.nextInt();

        System.out.println(add(a,b, c));
      }
    } else if (operation == '-'){
      System.out.println("Enter first number: ");
          int a = scanner.nextInt();

          System.out.println("Enter second number: ");
          int b = scanner.nextInt();

          System.out.println(subtract(a,b));
    } else if (operation == '*'){
      System.out.println("Enter first number: ");
          int a = scanner.nextInt();

          System.out.println("Enter second number: ");
          int b = scanner.nextInt();

          System.out.println(multiply(a,b));
    } else if (operation == '/'){
      System.out.println("Enter first number: ");
          double a = scanner.nextDouble();

          System.out.println("Enter second number: ");
          double b = scanner.nextDouble();

          System.out.println(divide(a,b));
    }

    scanner.close();
  }

  public static int add(int a,int b){
    return a+b;
  }

  public static int add(int a,int b, int c){
    return a+b+c;
  }

  public static double add(double a,double b){
    return a+b;
  }

  public static int subtract(int a,int b){
    return a-b;
  }

  public static int multiply(int a, int b){
    return a*b;
  }

  public static double divide(double a, double b){
    return a/b;
  }
}