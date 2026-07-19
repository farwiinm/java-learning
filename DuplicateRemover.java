import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class DuplicateRemover {
  public static void main(String[] args){
    ArrayList<Integer> arrayList = new ArrayList<>();
    Collections.addAll(arrayList,2,3,4,5,6,7,8,8,10,11);
    System.out.println(arrayList);

    HashSet<Integer> hashList = new HashSet<>(arrayList);
    System.out.println(hashList);

    ArrayList<Integer> newArrayList = new ArrayList<>(hashList);
    System.out.println(newArrayList);
  }
  
}
