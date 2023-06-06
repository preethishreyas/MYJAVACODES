import java.util.*;

public class RepatingLeet {
    public static int preethi(String S) {
        for (int i = 0; i < S.length(); i++) {
            int count = 0;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int a = preethi(str);
        System.out.println(a);

    }

}
