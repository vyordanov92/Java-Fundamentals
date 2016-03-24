/**
 * Created by Yordanov on 3/16/2016.
 */

import java.util.Locale;
import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        double firstNumber = sc.nextDouble();
        double secondNumber = sc.nextDouble();
        double thirdNumber = sc.nextDouble();
        double average = findAverage(firstNumber, secondNumber, thirdNumber);

        System.out.format("The average number is %.2f \n", average);

    }

    private static double findAverage(double firstNumber, double secondNumber, double thirdNumber) {

        double sum = firstNumber + secondNumber + thirdNumber;
        double average = sum / 3;

        return average;
    }
}
