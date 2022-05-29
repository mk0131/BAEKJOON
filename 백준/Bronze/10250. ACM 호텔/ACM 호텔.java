import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int th = sc.nextInt();
			if (th % h == 0) {
				arr[i] = (h * 100) + (th / h); 
			} else {
				arr[i] = ((th % h) * 100 + (th / h) + 1);
			}

		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}