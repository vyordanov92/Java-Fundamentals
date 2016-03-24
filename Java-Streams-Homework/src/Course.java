import java.io.Serializable;

/**
 * Created by Yordanov on 3/24/2016.
 */
public class Course implements Serializable {
    String name;
    int number;

    Course (String name, int number){
        this.name = name;
        this.number = number;
    }
}
