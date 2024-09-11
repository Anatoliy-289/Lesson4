import java.time.LocalDate;

public class Student extends User {
    
    public Student(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastName = lastname;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%d, name=%s, lastName=%s]" id, name, lastName);
    }

}
