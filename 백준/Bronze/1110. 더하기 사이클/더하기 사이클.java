import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c, d, e = 0;
        int f = n;

        while (true) {
            if (n < 10) {
                a = n; // 각 자리 수의 합
                b = n; // 주어진 수의 오른쪽 자리수
                c = b * 10 + a; // 주어진 자리의 오른쪽 자리 수와 합의 오른쪽 자리수 이어붙이기 = 새로운 수
                e++;
            } else {
                a = (n / 10) + (n % 10);
                b = n % 10;
                d = (a % 10);
                c = b * 10 + d;
                e++;
            }
            n = c;
            if (n == f) {
                break;
            }
        }
        System.out.println(e);

    }
}
