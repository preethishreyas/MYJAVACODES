import java.util.*;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        if (count == 2) {
            System.out.println("Its is a prime number");
        } else
            System.out.println("it is not a prime number");
    }
}
