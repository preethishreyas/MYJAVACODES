import java.util.*;

public class Primenumberlimit {
    public static void preethi(int num) {
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        preethi(a);

    }
}
