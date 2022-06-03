import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var arr = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            boolean isPrime = true;

            if (i == 1) {
                continue;
            }
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                arr.add(i);
            }
        }
        for (Object o : arr) {
            System.out.println(o);

        }

    }

}