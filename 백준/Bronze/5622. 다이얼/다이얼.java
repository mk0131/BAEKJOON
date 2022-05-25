import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String[] arr = s.split("");
		int n = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("A") || arr[i].equals("B") || arr[i].equals("C")) {
				n += 2;
			} else if (arr[i].equals("D") || arr[i].equals("E") || arr[i].equals("F")) {
				n += 3;
			} else if (arr[i].equals("G") || arr[i].equals("H") || arr[i].equals("I")) {
				n += 4;
			} else if (arr[i].equals("J") || arr[i].equals("K") || arr[i].equals("L")) {
				n += 5;
			} else if (arr[i].equals("M") || arr[i].equals("N") || arr[i].equals("O")) {
				n += 6;
			} else if (arr[i].equals("P") || arr[i].equals("Q") || arr[i].equals("R") || arr[i].equals("S")) {
				n += 7;
			} else if (arr[i].equals("T") || arr[i].equals("U") || arr[i].equals("V")) {
				n += 8;
			} else if (arr[i].equals("W") || arr[i].equals("X") || arr[i].equals("Y") || arr[i].equals("Z")) {
				n += 9;
			}
		}

		System.out.println(n + arr.length);

	}
}