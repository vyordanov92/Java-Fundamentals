/**
 * Created by Yordanov on 3/25/2016.
 */
import java.util.Scanner;
public class CountAllWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split("\\W+");

        System.out.print(text.length);
    }
}
