import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExercise {
  public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(1,4,5,2,4,-6,6,3,2,-2,-10,3,4,2,2,11,9,5);

    List<Integer> even = numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
    System.out.println(even);

    List<Integer> greaterTen = numbers.stream().filter(e->e>10).collect(Collectors.toList());
    System.out.println(greaterTen);

    int positiveSum = numbers.stream().filter(e->e>=0)
    .reduce(0,Integer::sum);
    System.out.println(positiveSum);

    double avg = numbers.stream().filter(e->e>=0)
    .mapToInt(Integer::intValue).average().orElse(0.0);
    System.out.println(avg);

    int max = numbers.stream()
    .mapToInt(Integer::intValue).max().orElse(0);
    System.out.println(max);

    //Find all even
    //Numbers >10
    //Sum of all positive numbers
    //Avg
    //Maximum
    //All seperate streams
  }
}
