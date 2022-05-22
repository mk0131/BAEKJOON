import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		int[] s = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.next();
			int count = 0;
			int sum = 0;
			String[] str = arr[i].split("");
			for (int j = 0; j < str.length; j++) {
				if (str[j].equals("O")) {
					count++;
					sum += count;

				} else {
					count = 0;
				}
			}
			s[i] = sum;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		sc.close();

	}

}
