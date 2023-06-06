import java.util.*;

public class Function {
    public static int add(int a, int b) {
        return a + b;

    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static String preeti() {
        return "The number is 7";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int chitti = sub(x, y);
        System.out.println(chitti);
        float val = add(chitti, 4);
        System.out.println(val);
        mul(chitti, val);
        String preethi = preeti();
        System.out.println(preethi);

    }

}
