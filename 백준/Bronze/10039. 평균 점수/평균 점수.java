import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int avg = 0;

		for (int i = 0; i < 5; i++) {

			int num = sc.nextInt();

			if (num < 40) {
				num = 40;
				avg += num;
			} else {
				avg += num;
			}

		}
		System.out.println(avg / 5);
	}
}