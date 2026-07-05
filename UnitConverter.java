public class UnitConverter{
  public static void main(String[] args){
    int distance = 7/2;
    double mile = distance*0.621371;
    String ans = mile +"km";
    System.out.println(ans);

    double celcius = 31;
    double faranheit = (celcius*9/5)+32;
    String ansTemp = faranheit+"F";
    System.out.println(ansTemp);
  }
}