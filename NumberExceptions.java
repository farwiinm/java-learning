public class NumberExceptions {
  public int readAge(String input){
    int number;
    try{
      number = Integer.parseInt(input);
    } catch (NumberFormatException e){
      number = -1;
    }
    return number;
  }  

  public static void main(String[] args){
    NumberExceptions num = new NumberExceptions();

    System.out.println(num.readAge("123"));
    System.out.println(num.readAge("123a"));
  }

}
