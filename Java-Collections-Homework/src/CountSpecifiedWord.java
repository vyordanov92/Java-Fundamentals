/**
 * Created by Yordanov on 3/25/2016.
 */
import java.util.Scanner;
public class CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine().toUpperCase();
        String[] text = inputText.split("\\W+");
        String target = sc.nextLine().toUpperCase();

        int count = 0;
        for(int i = 0; i < text.length; i++) {
            if(target.equals(text[i])) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
