import java.util.*;

public class Pythagoras {
    public static double Hypotenuse(double A, double B) {
        double Hypotenuse = Math.sqrt((A * A) + (B * B));
        return Hypotenuse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double H = Hypotenuse(x, y);
        System.out.println(H);

    }
}
