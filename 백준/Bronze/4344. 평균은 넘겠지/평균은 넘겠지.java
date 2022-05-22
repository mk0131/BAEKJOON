import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];

		for (int i = 0; i < num; i++) {
			double avg = 0;
			int cnt = 0;

			String[] str = sc.nextLine().split(" ");
			for (int j = 1; j < str.length; j++) {
				avg = avg + Double.parseDouble(str[j]);
			}
			avg = avg / Double.parseDouble(str[0]);
			for (int j = 1; j < str.length; j++) {
				if (avg < Double.parseDouble(str[j])) {
					cnt++;
				}
			}
			arr[i] = String.format("%.3f", cnt / Double.parseDouble(str[0]) * 100);

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "%");
		}

		sc.close();

	}
}
