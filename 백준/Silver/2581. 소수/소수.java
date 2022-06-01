import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int count = 0;
        int small = 0;


        for (int i = m; i <= n; i++) {

            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;

            if (i == 1) {    // 1 인경우 다음 반복문으로
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;    // 소수가 아니므로 false 로 바꿔줌
                    break;
                }
            }
            if (isPrime) {    // 소수인경우 count 값 1 증가
                count += i;
                if (small == 0) {
                    small = i;
                }

            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
            System.out.println(small);
        }


    }

}