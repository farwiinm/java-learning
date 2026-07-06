public class SumDigits{
  public static void main(String[] args){
      System.out.println(sumDigits(1234567891));
  }

  public static int sumDigits(int n){
    int last = n%10;
    if (n<=9){
      return n;
    } else {
      return last+sumDigits(n/10);
    }
  }

  

}