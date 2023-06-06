import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int m = 1; m <= x; m++) {
            for (int n = 1; n <= y; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
