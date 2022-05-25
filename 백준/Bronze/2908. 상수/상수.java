import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int s = (n % 10) * 100 + (n % 100 / 10) * 10 + (n / 100);
		int u = (m % 10) * 100 + (m % 100 / 10) * 10 + (m / 100);

		if (s > u) {
			System.out.println(s);
		} else {
			System.out.println(u);
		}
	}
}