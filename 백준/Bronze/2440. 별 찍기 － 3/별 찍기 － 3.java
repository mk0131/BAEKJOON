import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;

		for (int i = 0; i < n; i++) {

			for (int j = n; j > a; j--) {
				System.out.print("*");

			}
			a++;
			System.out.println();

		}
	}
}
