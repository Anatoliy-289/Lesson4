import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Teacher extends User {

    public Teacher (int id, String name, String lastname, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.lastName = lastname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("Teacher [id=%d, name=%s, lastName=%s, birhday=%s]" id, name, lastName, birthday);
    }


    //@Override
    //public Double get() {
        //return 1.2;
    //}
    
}


//ещё один возможный вариант
//public class Teacher extends User<String> {

    //@Override
    //public String get() {
        //return "new Teacher()";
    //}
    
//}





