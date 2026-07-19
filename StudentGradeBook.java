import java.util.HashMap;

public class StudentGradeBook {
 HashMap<String,Integer> student = new HashMap<>();
 
 //addStudent(String name, int grade)
 public void addStudent(String name, int grade){
  student.put(name,grade);
 }
 //getGrade(String name)
 public int getGrade(String name){
  int grade = student.get(name);
  return grade;
 }

 //getAverage()
 public double getAverage(){
  int total=0;

  for (int grade : student.values()){
    total+=grade;
  }
  return (double) total/student.size();
 }

 //getTopStudent()
 public String getTopStudent(){
  String topStudent = "";
  int highestGrade = -1;

  for (String name : student.keySet()){
    int currentStudent = student.get(name);
    if (currentStudent>highestGrade){
      currentStudent=highestGrade;
      topStudent = name;
    }
  }
  return topStudent;
 }

 public static void main(String[] args){
  StudentGradeBook gradeBook = new StudentGradeBook();
  gradeBook.addStudent("Farwin", 78);
  gradeBook.addStudent("Dorothy", 55);

  System.out.println(gradeBook.getGrade("Farwin"));

  System.out.println(gradeBook.getTopStudent());

  System.out.println(gradeBook.getAverage());
 }
}
