import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void  sendOnConsole(List<T> students) {
        return students;
    }
   
}
