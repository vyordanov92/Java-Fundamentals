/**
 * Created by Yordanov on 3/25/2016.
 */
import java.util.Scanner;
public class LargestSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] splitStr = sc.nextLine().split(" ");
        int counter = 1;
        int maxCounter = 1;
        int index = 0;

        for(int i = 1; i < splitStr.length; i++) {
            if(splitStr[i].equals(splitStr[i - 1])) {
                counter++;
            } else {
                counter = 1;
            }
            if(counter > maxCounter) {
                maxCounter = counter;
                index = i;
            }
        }
        for(int i = 0; i < maxCounter; i++) {
            System.out.print(splitStr[index] + " ");
        }
    }
}
