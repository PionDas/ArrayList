import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Pion", 19));
        students.add(new Student("Bob", 20));

        for(Student s: students){
            System.out.println(s.getName());
        }
    }
}
