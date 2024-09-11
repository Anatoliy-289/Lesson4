import java.util.List;

public class TeacherView implements UserView<Teacher> {
    
    @Override
    public void  sendOnConsole(List<T> teachers) {
        return teachers;
    }
}
