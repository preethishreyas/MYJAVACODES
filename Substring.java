
import java.util.Scanner;

import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char firstch = word.charAt(0);
        char secondch = word.charAt(word.length() - 1);
        System.out.println(firstch);
        System.out.println(secondch);

    }
}
