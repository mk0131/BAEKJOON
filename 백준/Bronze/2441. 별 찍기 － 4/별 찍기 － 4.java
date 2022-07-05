import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = n;
		String str = "";

		for (int i = 0; i < n; i++) {
			if (i > 0) {
				System.out.print(str);
			}
			for (int j = 0; j < a; j++) {
				System.out.print("*");

			}

			System.out.println();
			a--;
			str += " ";

		}
	}
}
