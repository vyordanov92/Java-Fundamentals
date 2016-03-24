/**
 * Created by Yordanov on 3/16/2016.
 */

import java.util.Scanner;

public class PrintCharacterTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[j] + " ");
            }
            System.out.println("");
        }

        for (int i = number - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[j] + " ");
            }
            System.out.println("");

        }
    }

}
