import java.io.*;
import java.util.ArrayList;

/**
 * Created by Yordanov on 3/24/2016.
 */
public class SaveAnArrayListOfDoubles {

    private static final String FILE_PATH = "C:\\Users\\Yordanov\\IdeaProjects\\Java-Streams-Homework\\doubles.list";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(3.14);
        doubles.add(9.8);
        doubles.add(4.57);
        doubles.add(7.5);
        output.writeObject(doubles);
        output.flush();

        ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILE_PATH));
        System.out.println(input.readObject());
        input.close();
    }
}
