import java.util.Arrays;
import java.util.List;

public class FindMax {
  public static <T extends Comparable<T>> T findMax(List<T> list){
    T max = list.get(0);

    for (T item:list){
      if(item.compareTo(max)>0){
        max=item;
      }
    }

    return max;
  }

  public static void main(String[] args){
    List<Integer> m = Arrays.asList(1,2,3,4);
    System.out.println(findMax(m));

    List<String> s = Arrays.asList("1,2,3,4","Hi","Ola");
    System.out.println(findMax(s));
  }
}
