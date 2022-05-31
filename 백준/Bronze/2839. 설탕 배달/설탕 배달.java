import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int five = (n / 5);
		int re = (n % 5);
		int three = 0;

		if (re % 3 == 0) {
			three = re / 3;
			
		} else {
			while (five != 0) {
				five -= 1;
				re = n - (5 * five);
				if (re % 3 == 0) {
					three = re / 3;
					break;
				}
			}
		}

		if (five == 0 && three == 0) {
			System.out.println(-1);
		} else {
			System.out.println(five + three);
		}

	}
}
