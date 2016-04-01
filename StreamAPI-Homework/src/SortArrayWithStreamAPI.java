/**
 * Created by Yordanov on 3/31/2016.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWithStreamAPI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        String wayToSort = sc.nextLine();

        if (wayToSort.equals("Ascending")) {
            Arrays.stream(numbers).map(n -> Integer.parseInt(n)).sorted().forEach(n -> System.out.print(n + " "));
        } else {
            Arrays.stream(numbers).map(n -> Integer.parseInt(n)).sorted((n1, n2) -> n2.compareTo(n1)).forEach(n -> System.out.print(n + " "));
        }

    }
}
