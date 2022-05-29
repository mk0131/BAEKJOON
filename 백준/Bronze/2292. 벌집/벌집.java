import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double n = sc.nextDouble();
		sc.close();

		System.out.println(Math.round(result(n)));

	}

	public static double result(double n) {

		double count = 1;
		double range = 2;

		if (n == 1) {
			return 1;
		} else {
			while (range <= n) {
				range = range + (6 * count);
				count++;
			}
			return count;
		}

	}

}
