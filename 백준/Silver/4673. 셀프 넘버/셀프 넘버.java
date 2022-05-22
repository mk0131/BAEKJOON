import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static int sum(int n) {
		int sum = n;
		String str = Integer.toString(n);
		for (int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(str.substring(i, i + 1));
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10001];

		for (int i = 1; i <= 10000; i++) {

			arr[i] = sum(i);

		}
		for (int i = 1; i <= 10000; i++) {
			boolean val = contains(arr, i);
			if (val == false) {
				System.out.println(i);
			}
		}

	}

	private static boolean contains(int[] arr, int i) {
		// TODO Auto-generated method stub
		return Arrays.stream(arr).anyMatch(a -> a == i);
	}

}

/*
 * 33 을 넣으면 39가 나온다 33은 39의 생성자 이다 sum(i) 의 값 n n의 생성자는 i 생성자가 없는 숫자를 셀프 넘버라 한다
 * 10000 이하의 셀프넘버를 출력하라
 */
