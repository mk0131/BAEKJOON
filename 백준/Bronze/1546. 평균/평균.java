import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] arr = new double[num];
		double a = 0;
		double sum = 0;

		for (int i = 0; i < num; i++) {
			int res = sc.nextInt();
			arr[i] = res;

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > a) {
				a = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] / a * 100;
		}
		System.out.println(sum / num);
		sc.close();

	}

}
