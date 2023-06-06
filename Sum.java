public class Sum {
    public static void main(String[] args) {
        Scanner sc = Scanner(System.in);
        int N = sc.nextInt();
        int Sum = 0;
        while (N > 0) {
            int r = N % 10;
            Sum = Sum + r;
            N = N / 10;

        }
        System.out.println("Sum");

    }
}
