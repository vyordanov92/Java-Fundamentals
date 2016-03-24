/**
 * Created by Yordanov on 3/16/2016.
 */

import java.util.Scanner;

public class GhettoNumeralSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stringNumber = sc.next();

        for (int i = 0; i < stringNumber.length(); i++) {

            System.out.print(convertDigitToGhetto(stringNumber.charAt(i)));
        }
    }

    private static String convertDigitToGhetto(char digit) {
        String ghettoDigit = " ";
        switch (digit) {
            case '0':
                ghettoDigit = "Gee";
                break;
            case '1':
                ghettoDigit = "Bro";
                break;
            case '2':
                ghettoDigit = "Zuz";
                break;
            case '3':
                ghettoDigit = "Ma";
                break;
            case '4':
                ghettoDigit = "Duh";
                break;
            case '5':
                ghettoDigit = "Yo";
                break;
            case '6':
                ghettoDigit = "Dis";
                break;
            case '7':
                ghettoDigit = "Hood";
                break;
            case '8':
                ghettoDigit = "Jam";
                break;
            case '9':
                ghettoDigit = "Mack";
                break;
            default:
                System.out.println("You cannot convert this number.");
                break;
        }
        return ghettoDigit;
    }
}

