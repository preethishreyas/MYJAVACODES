import java.util.Scanner;

public class Example3 {
    public static String preethi() {
        return "Hello";
    }

    public static void shreyas(String s) {
        System.out.println("OYE" + s);
    }

    public static int Subtract(int a, int b) {
        int sub = a - b;
        return sub;

    }

    public static int mul(int a) {
        int mul = a * 10;
        return mul;
    }

    public static int add(int a, int b, int c) {
        int add = a + b + c;
        return add;
    }

    public static double thanoj(int a, int b, int c) {
        double thanoj = (a * b) / c;
        return thanoj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = Subtract(c, d);
        double z = thanoj(d, e, c);
        System.out.println(z);
        String w = preethi();
        System.out.println(w);
        shreyas("puppy");

    }

}
