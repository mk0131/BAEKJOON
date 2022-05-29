import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		sc.close();

		System.out.println(price(a, b, c));

	}

	public static long price(long a, long b, long c) {

		long i = 0;
		if (b > c) {
			return -1;
		} else {
			long d = c - b;
			if (c - b == 0) {
				return -1;
			} else {
				i = a / d + 1;
				return i;
			}
		}
	}

}
