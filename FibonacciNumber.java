// 0 1 1 2 3 5 8 13 21 34 65
public class FibonacciNumber {
	public static void main(String[] args) {
		int f1 = 0, f2 = 1, f3 = 1, i = 3;

		System.out.println(f1 + " " + f2);
		do {
			f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
			i++;
		} while (i <= 20);
	}

}
