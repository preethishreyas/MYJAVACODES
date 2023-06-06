import java.util.*;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MUL = 0;
        int N = input.nextInt();
        MUL = N * (N + 1);
        System.out.println(" ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(MUL * i);
        }

    }
}
