import StudentGroupController.java
import Student.java;
import StudentGroup.java;
import StudentGroupService.java;

public class Lesson4 {
    public static void main(String[] args) {
        
        new StudentController()
                .sendOnConsole(list.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(2, "Ira", "Ivanova"))); 
    }

    //private static List<Student> getStudents() {
        //Student s1 = new Student(1, "Sasha", "Ivanov");
        //Student s2 = new Student(2, "Ira", "Ivanova");
        //return list.of(s1, s2);
    //}
}
