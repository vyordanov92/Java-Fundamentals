import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Yordanov on 3/24/2016.
 */
import java.io.*;

public class CountCharactersType {

    private static final String READING_FILE_PATH = "C:\\Users\\Yordanov\\IdeaProjects\\Java-Streams-Homework\\words.txt";
    private static final String WRITING_FILE_PATH = "C:\\Users\\Yordanov\\IdeaProjects\\Java-Streams-Homework\\count-chars.txt";

    public static void main(String[] args) throws IOException {

        String vowelsSymbols = "aeiou";
        String punctuationSymbols = "!.,?";
        Integer consonants = 0;
        Integer vowels = 0;
        Integer punctuation = 0;

        FileInputStream input = new FileInputStream(new File(READING_FILE_PATH));
        FileWriter writer = new FileWriter(new File(WRITING_FILE_PATH));
        int symbol;

        while ((symbol = input.read()) != -1) {
            char ch = (char) symbol;
            if (vowelsSymbols.contains(ch + "")) {
                vowels++;
            } else if (punctuationSymbols.contains(ch + "")) {
                punctuation++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        writer.write(String.format("Vowels: %d%n", vowels));
        writer.write(String.format("Consonants: %d%n", consonants));
        writer.write(String.format("Punctuation: %d%n", punctuation));
        input.close();
        writer.close();

    }
}
