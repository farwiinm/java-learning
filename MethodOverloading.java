public class MethodOverloading {
  public void formatOutput(int number1){
    System.out.println(number1);
  }

  public void formatOutput(String s1){
    System.out.println(s1);
  }

  public void formatOutput(double d1){
    System.out.println(d1);
  }

  public static void main(String[] args){
    MethodOverloading out = new MethodOverloading();
    out.formatOutput(4);
    out.formatOutput("hi");
    out.formatOutput(4.78);

  }
}
