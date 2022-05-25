import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pattern p = Pattern.compile("(c=|c-|dz=|d-|lj|nj|s=|z=|[(a-z)])");
		Matcher m = p.matcher(sc.next());

		sc.close();
		int count = 0;

		while (m.find()) {
			count++;
		}

		System.out.println(count);
	}
}