public class StudentGroupController {
    
    private StudentGroupController(StudentGroupService servise) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }
}
