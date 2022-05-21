import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = -10000001;
		var num = new int[9];
		int c = 0;

		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > b) {
				b = num[i];
			}

		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == b) {
				c = i+1;
			}

		}
		System.out.println(b);
		System.out.println(c);

		sc.close();
	}

}
