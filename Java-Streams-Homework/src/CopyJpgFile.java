import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Yordanov on 3/24/2016.
 */
public class CopyJpgFile {

    private static final String IMAGE_PATH = "C:\\Users\\Yordanov\\IdeaProjects\\Java-Streams-Homework\\lambo.jpg";
    private static final String COPIED_IMAGE_PATH = "C:\\Users\\Yordanov\\IdeaProjects\\Java-Streams-Homework\\copiedLambo.jpg";

    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream(IMAGE_PATH);
        FileOutputStream output = new FileOutputStream(COPIED_IMAGE_PATH);

        int byteContainer;

        while ((byteContainer = input.read()) != -1) {
            output.write(byteContainer);
        }
        input.close();
        output.close();

    }
}
