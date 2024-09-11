// Задача 3.
// -Модифицировать ранее созданный класс Controller, переименовав его в StudentController.
// -Создайте новый интерфейс UserController
// -Опишите в нем метод create
// -Типизировать его Т, наследующегося от типа User.
// -В классе StudentController реализуйте интерфейс UserController
// -Добавьте в методы контроллера вывод в консоль с помощью метода sendOnConsole

public class StudentController implements UserController {

    private UserService<Student> service = new StudentController();
    
    @Override
    public <T extends User> User create(T user) {
        return (User) user;
    }
    
    public void sendOnConsole(List<Student> students) {
        controller.sendOnConsole(students);
    }
}
