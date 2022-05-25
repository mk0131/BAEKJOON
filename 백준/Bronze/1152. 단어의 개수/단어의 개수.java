import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int n = 0;
		String[] s = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("")) {
				n++;
			}
		}

		System.out.println(s.length - n);

	}
}