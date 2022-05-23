import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] st = new String[n];

		for (int i = 0; i < n; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			String str = "";

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					str += s.charAt(j);
				}

			}
			st[i] = str;
		}

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}

	}

}
