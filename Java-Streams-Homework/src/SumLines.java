/**
 * Created by Yordanov on 3/24/2016.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SumLines {

    private static final String FILE_PATH = "C:\\Users\\Yordanov\\IdeaProjects\\Java-Streams-Homework\\lines.txt";

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> outputResult = new ArrayList<>();

        try (BufferedReader bfr = new BufferedReader(new FileReader(FILE_PATH))) {

            String inputLine;
            while ((inputLine = bfr.readLine()) != null) {
                int currentSum = 0;
                for (int i = 0; i < inputLine.length(); i++) {
                    currentSum += inputLine.charAt(i);
                }
                outputResult.add(currentSum);
            }
        }
        for (int i = 0; i < outputResult.size(); i++) {
            System.out.println(outputResult.get(i));
        }
    }
}
