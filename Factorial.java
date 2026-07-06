public class Factorial{
  public static void main(String[] args){
    //Recursive algorithm
    System.out.println(factorial(10));
    System.out.println(factorialIterative(10));
  }

  public static int factorial(int n){
    if (n==1){
      return 1;
    } else {
      return n*factorial(n-1);
    }
  }

  public static int factorialIterative(int n){
    int result = 1;
    for (int i=1; i<=n; i++){
      result *= i;
    }
    return result;
  }
}