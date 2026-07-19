import java.util.HashMap;

public class WordFrequencyCounter{
  public static void main(String[] args){
    String sentence = "Hi I am Farwin";
    String[] words = sentence.split(" ");

    //System.out.println(Arrays.toString(words));
    HashMap<String,Integer> frequency = new HashMap<>();
    for (String word : words){
      String cleaned = word.toLowerCase();

      frequency.put(cleaned,frequency.getOrDefault(cleaned, 0)+1);
    }

    System.out.println(frequency);
  }
}