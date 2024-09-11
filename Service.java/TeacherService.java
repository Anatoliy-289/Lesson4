package Service.java;

public class TeacherService {
    
    public Teacher createTeacher(int id, String name, String last, LocalDate birthday) {
        return new Teacher(id, name, last, birthday);
    }

    @Override
    public void createOnConsole(List<Teacher> teachers) {
        System.out.println(teachers);
    }

    public void TeacherVew<T extends UserView> {
        void sendOnConsole(List<T> students);
    }

    public void showTeacher(List<T> teachers) {
        return teachers;
    }

    public void removeTeacher(List<T> teachers) { 
        return teachers;
    }

}
