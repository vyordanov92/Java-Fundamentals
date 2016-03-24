import java.io.*;

/**
 * Created by Yordanov on 3/24/2016.
 */
public class SaveACustomObjectInAFile {

    private static final String FILE_PATH = "C:\\Users\\Yordanov\\IdeaProjects\\Java-Streams-Homework\\course.save";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILE_PATH));

        Course newCourse = new Course("Java fundamentals", 200);
        output.writeObject(newCourse);
        Course readerObject = (Course)input.readObject();
        System.out.println(readerObject);


    }
}
