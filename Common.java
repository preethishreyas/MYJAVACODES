import java.util.*;

public class Common {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                    System.out.print(s1.charAt(i));

                }

            }
        }
        System.out.println();
        System.out.println(count);

    }
}
