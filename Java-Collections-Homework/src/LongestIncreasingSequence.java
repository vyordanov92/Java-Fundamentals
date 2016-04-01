/**
 * Created by Yordanov on 3/25/2016.
 */
import java.util.Scanner;
public class LongestIncreasingSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int[] numbers = new int[line.length];

        //Parse

        for(int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }

        int counter = 0;
        int counterSeqence = 1;
        int indexNumber = 0;

        System.out.print(numbers[0] + " ");
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > numbers[i - 1]) {
                System.out.print(numbers[i] + " ");
                counterSeqence++;
            } else {
                System.out.println();
                System.out.print(numbers[i] + " ");
                counterSeqence = 1;
            }
            if(counterSeqence > counter) {
                counter = counterSeqence;
                indexNumber = i;
            }
        }
        System.out.println();
        System.out.print("Longest: ");
        int index = (indexNumber - (counter - 1));
        if(counter > 1) {
            for(int j = 0; j < counter; j++) {
                System.out.print(numbers[index] + " ");
                index++;
            }
        } else {
            System.out.print(numbers[0]);
        }
    }
}
