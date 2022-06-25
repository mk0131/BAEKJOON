import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			int max = Math.max(a, b);
			int max_2 = Math.max(max, c);

			int min = Math.min(a, b);
			int min_2 = Math.min(max, c);

			if ((max_2 * max_2) == (min * min) + (min_2 * min_2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}
	}
}
