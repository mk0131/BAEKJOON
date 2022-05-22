import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int total = 0;

		for (int i = 0; i < num; i++) {
			total += Integer.parseInt(str.substring(i, i + 1));
		}
		System.out.println(total);

	}

}
