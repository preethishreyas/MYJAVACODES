import java.util.*;

public class Even {
    void num() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("It is even nuber" + i);
            }
        }
    }

    class arithmetic extends Even {
        void Arithmetic() {
            int sum, sub, mul, div, a, b = 0;
            sum = a + b;
            sub = a - b;
            mul = a * b;
            div = a / b;
            System.out.println("Addition of two numbers" + sum);
            System.out.println("Subtraction of two numbers" + sub);
            System.out.println("Multiplication of two numbers" + mul);
            System.out.println("Division of two numbers" + div);
        }
    }

    class inheritance2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num = sc.nextInt();
            int sum = sc.nextInt();
            int swap = sc.nextInt();

            class Arithmetic extends Swapping {
                void Swapping() {
                    int a, b, temp;
                    temp = a;
                    a = b;
                    b = temp;
                    System.out.println("Swapping of two numbers" + swap);
                    Even ev = new Arithmetic();
                    Arithmetic ar = new Swapping();
                    ev.num();
                    ev.sum();
                    ev.sub();
                    ev.mul();
                    ev.div();
                    ar.swapping();
                }

            }
        }
    }
}