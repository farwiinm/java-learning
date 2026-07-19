import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapComparisons {
  public static void main(String[] args){
    HashMap<String,Integer> hash = new HashMap<>();
            hash.put("Apple", 15);
        hash.put("Banana", 70);
        hash.put("Orange", 30);

    LinkedHashMap<String,Integer> linkedMap = new LinkedHashMap<>();
            linkedMap.put("Apple", 15);
        linkedMap.put("Banana", 70);
        linkedMap.put("Orange", 30);

    TreeMap<String,Integer> treeMap = new TreeMap<>();
treeMap.put("Apple", 15);
        treeMap.put("Banana", 70);
        treeMap.put("Orange", 30);

        for (String name : hash.keySet()){
          System.out.println("HashMap: "+name);
        }

        for (String name : linkedMap.keySet()){
          System.out.println("LinkedHashMap: "+name);
        }

        for (String name : treeMap.keySet()){
          System.out.println("TreeMap: "+ name);
        }
  }
}
