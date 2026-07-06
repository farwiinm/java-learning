public class Fibonacci{
  public static void main(String[] args){
    System.out.println(fibonacci(10));
    fibonacciIterative(10);
  }

  public static int fibonacci(int n){
    //0,1,1,2,3,5,8,13,21,34

    if (n==1){
      return 1;
    } else if (n==0){
      return 0;
    } else {
      return fibonacci(n-1)+fibonacci(n-2);
    }

    
  }

  public static void fibonacciIterative(int n){
    //0,1,1,2,3,5,8,13,21,34
    int first=0;
    int second =1;
    int result = 0;
    for (int i=1;i<n;i++){
      first = second;
      second = result;
      result = first +second;
      System.out.println(result);
    }
  }
}