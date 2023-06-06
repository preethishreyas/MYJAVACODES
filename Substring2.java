import java.util.*;

public class Substring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int i = word.length() - 2; i >= 1; i--) {
            System.out.print(word.charAt(i));

        }
    }

}
