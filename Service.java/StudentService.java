public class StudentService {

    public Student createStudent(int id, String name, String last) {
        return new Student(id, name, last);
    }

    @Override
    public void createOnConsole(List<Student> students) {
        System.out.println(students);
    }

    public void StudentView<T extends UserView> {
        void sendOnConsole(List<T> students);
    }

}
