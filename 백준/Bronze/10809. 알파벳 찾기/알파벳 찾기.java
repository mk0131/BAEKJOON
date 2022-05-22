import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];

		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}

		String str = sc.nextLine();
		sc.close();

		for (int i = 0; i < str.length(); i++) {

			int num = 97;

			for (int j = 0; j < 26; j++) {
				char c = (char) num;

				if (str.substring(i, i + 1).charAt(0) == c) {
					if (arr[j] == -1) {
						arr[j] = i;
						break;
					}
				}

				num++;

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}