/**
 * Created by Yordanov on 3/25/2016.
 */
import java.util.Scanner;
public class SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] seqArray = sc.nextLine().split(" ");

        for (int i = 0; i < seqArray.length - 1; i++) {
            if (seqArray[i].equals(seqArray[i + 1])) {
                System.out.print(seqArray[i] + " ");
            } else {
                System.out.println(seqArray[i]);
            }
        }
        if (seqArray[seqArray.length - 2].equals(seqArray[seqArray.length - 1])) {
            System.out.print(seqArray[seqArray.length - 1]);
        } else {
            System.out.println(seqArray[seqArray.length - 1]);
        }
    }
}
