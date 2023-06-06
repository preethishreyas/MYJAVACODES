public class primeornot1 {
	public static void main(String[] args) {
		int i;
		int j;
		for (i = 1; i <= 10; i++) {
			int count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 1) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
		}
	}

}
