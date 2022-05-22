import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int han = 0;

		for (int i = 1; i <= num; i++) {
			if (i < 100) {
				han = i;
			} else {
				if (sum(i) == true) {
					han++;
				}
			}

		}
		System.out.println(han);
	}

	static boolean sum(int n) {
		boolean val = false;
		String str = Integer.toString(n);
		int[] arr = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = Integer.parseInt(str.substring(i, i + 1));
		}

		if (arr[0] - arr[1] == arr[1] - arr[2]) {
			val = true;
		}
		return val;
	}

}
