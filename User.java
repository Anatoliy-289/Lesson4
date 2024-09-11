//Задача 1.
// -Создать класс User и перенести в него базовые поля (ФИО)
// -Модифицировать ранее созданный класс StudentComparator
// -Переименовать в UserComparator
// -Типизировать его Т наследущегося от типа User (T extends User)
// -Типизировать реализуемый интерфейс Компаратор Т
// -Изменить метод Compare, внеся во входные данные вместо конкретных классов типизацию Т
// -Внести правки места, где использовался предыдущий компаратор


import java.time.LocalDate;
import java.util.Comparator;

public abstract class User extends UserComparator<User> implements Comparable<User> {
        
    protected int id;
    protected String name;
    protected String lastName;
        
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }
}