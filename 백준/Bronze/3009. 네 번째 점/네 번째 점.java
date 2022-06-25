import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int m = 0;

		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (x == a) {
			n = c;
		} else if (x != a && x == c) {
			n = a;
		} else {
			n = x;
		}

		if (y == b) {
			m = d;
		} else if (y != b && y == d) {
			m = b;
		} else {
			m = y;
		}

		System.out.println(n + " " + m);
	}
}
