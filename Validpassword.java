import java.util.*;

public class Validpassword {
    public static void preethi(String P) {
        if (P.toLowerCase() == P || P.toUpperCase() == P) {
            System.out.println("It is a Invalid Password");
        } else
            System.out.println("It is valid Password");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = sc.nextLine();
        preethi(P);

    }
}