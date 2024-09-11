package Controller.java;

public class TeacherController implements UserController {

    private UserService<Teacher> service = new TeacherService();
    
    @Override
    public <T extends User> User create(T user) {
        return (User) user;
    }
    
    public void sendOnConsole(List<Teacher> teachers) {
        service.sendOnConsole(teachers);
    }
   
}