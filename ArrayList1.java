import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1{
  public static void main(String[] args){
    ArrayList<String> students = new ArrayList<>();
    students.add("Farwin");
    students.add("Monica");
    students.add("Joey");

    for (String student : students){
      System.out.println(student);
    }

    System.out.println(students.contains("Farwin"));
    students.remove(1);
    Collections.sort(students);

    System.out.println(students);
  }
} 
