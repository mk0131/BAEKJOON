import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		sc.close();

		System.out.println(result(n));

	}

	public static String result(int n) {

		int cro = 1; // 대각선 칸 개수
		int sum = 0; // 직전 대각선 까지 칸의 누적 합

		String str = "";
		while (true) {
			if (n <= sum + cro) { // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위
				if (cro % 2 == 1) { // 대각선의 개수가 홀수
					str = (cro - (n - sum - 1)) + "/" + (n - sum); // 분모는 대각선 개수 -(n 번째 - 직전 대각선 까지의 누적합 -1)
					// 분자는 x 번째 - 직전 대각선까지의 누적합
					break;
				} else { // 짝수라면 홀수의 반대로 출력
					str = (n - sum) + "/" + (cro - (n - sum - 1));
					break;
				}
			} else {
				sum += cro;
				cro++;
			}

		}
		return str;

	}

}
