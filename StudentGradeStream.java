import java.util.HashMap;
import java.util.Map;

public class StudentGradeStream {
  public static void main(String[] args){
    HashMap<String,Integer> students = new HashMap<>();
    Map<String,Integer> newStudents = Map.of("Farwin",65,"Mahir",75,"Sam",85);
    students.putAll(newStudents);

    newStudents.entrySet().stream().filter(s->s.getValue() >= 75).sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
    .forEach(s -> System.out.println(s.getKey()+s.getValue()));;

  //FILTER STUDENTS ABOVE 75 GRADE
  //SORT BY GRADE DESC
  //PRINT EACH NAME AND GRADE

  }
  
  
  
}
