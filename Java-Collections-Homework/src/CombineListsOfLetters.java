/**
 * Created by Yordanov on 3/28/2016.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class CombineListsOfLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] basicText = sc.nextLine().replace(" ", "").toCharArray();
        char[] additionalText = sc.nextLine().replace(" ", "").toCharArray();

        ArrayList<Character> basicList = new ArrayList<>();
        ArrayList<Character> additionalList = new ArrayList<>();

        for(Character letter : basicText) {
            basicList.add(letter);
            additionalList.add(letter);
        }
        for(Character letter : additionalText) {
            if(!additionalList.contains(letter)) {
                basicList.add(letter);
            }
        }
        for(Character letter : basicList) {
            System.out.print(letter + " ");
        }
    }
}
