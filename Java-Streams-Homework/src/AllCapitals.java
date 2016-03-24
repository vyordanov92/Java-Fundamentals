import java.io.*;

/**
 * Created by Yordanov on 3/24/2016.
 */
public class AllCapitals {

    private static final String FILE_PATH = "C:\\Users\\Yordanov\\IdeaProjects\\Java-Streams-Homework\\lines.txt";

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new FileReader(FILE_PATH));
        String fullText = "";
        String tempText;

        while ((tempText = bfr.readLine()) != null) {
            fullText += tempText.toUpperCase() + "\r\n";
        }

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(FILE_PATH)));
        pw.write(fullText);
        pw.flush();
        bfr.close();
        pw.close();
    }
}
