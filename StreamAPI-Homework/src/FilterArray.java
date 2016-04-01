/**
 * Created by Yordanov on 3/31/2016.
 */
import java.util.Arrays;
import java.util.Scanner;
public class FilterArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        Arrays.stream(words).filter(el -> el.length() > 3).forEach(el -> System.out.print(el + " "));
    }
}

