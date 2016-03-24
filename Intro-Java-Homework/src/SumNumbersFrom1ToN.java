/**
 * Created by Yordanov on 3/16/2016.
 */

import java.util.Scanner;

public class SumNumbersFrom1ToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.print(sum);

    }


}
