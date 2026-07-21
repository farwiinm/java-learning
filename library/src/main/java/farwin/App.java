package farwin;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

class Student {
    // 1. Added field to store the name so Gson has something to serialize!
    String name;

    // 2. Added the missing constructor that accepts a String
    public Student(String name) {
        this.name = name;
    }
    
    public static void main(String[] args){
        Gson gson = new Gson();

        Student student = new Student("Farwin");

        String result = gson.toJson(student);
        System.out.println("JSON String: " + result);

        // 3. FIXED: Changed data type from String to Student because fromJson returns a Student object!
        Student backResult = gson.fromJson(result, Student.class);

        // 4. Printing the name field from the restored Student object
        System.out.println("Restored Student Name: " + backResult.name);
    }
}