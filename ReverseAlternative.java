import java.util.Scanner;

public class ReverseAlternative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int i = word.length() - 2; i >= 0; i -= 2) {

            System.out.print(word.charAt(i));
        }

    }

}
