import java.util.Scanner;

public class GradeCalc{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a grade: ");
    int grade = scanner.nextInt();

    if (grade>=90){
      System.out.println("A");
    } else if (grade>=75 && grade <=89){
      System.out.println("B");
    } else if (grade>=74 && grade <=60){
      System.out.println("C");
    } else {System.out.println("Fail");}

    scanner.close();
  }
}