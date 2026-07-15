import java.util.ArrayList;
import java.util.Collections;

public class NumberAnalyser {
  public static void main(String[] arg){
      ArrayList<Integer> numbers = new ArrayList<>();
      Collections.addAll(numbers,1,2,3,4,5,6,7,8);

      int maximum = numbers.get(0);
      int minimum = numbers.get(0);
      int sum = numbers.get(0);
      for (int i=1;i<numbers.size();i++){
        //max, min, sum, average
        int current = numbers.get(i);

        if (current>maximum){
          maximum = current;
        } else if (current<minimum){
          minimum = current;
        }

        sum = sum + numbers.get(i);
      }
      System.out.println(maximum);
      System.out.println(minimum);
      System.out.println(sum);
      System.out.println(sum/numbers.size());

  }
}
