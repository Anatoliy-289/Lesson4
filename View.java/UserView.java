//Задача 2.
// -Создать интерфейс UserView
// -Типизировать его Т наследующегося от типа User
// -Создать в метод sendOnConsole(List<Student>students)используя типизацию
// -Создать класс StudentView, реализующий созданный интерфейс

import java.util.List;

public interface UserView<T extends User> {
    
    void sendOnConsole(List<T> users);
}
