import java.util.*;

public class CheckLeet {
    public static boolean preethi(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                c = i;
                break;
            }
        }
        for (int i = c; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        boolean p = preethi(S);
        System.out.println(p);

    }
}
