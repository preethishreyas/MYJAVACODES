import java.util.Scanner;

public class HelloStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.print("*");
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + "*");

        }

    }
}
