import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var arr = new ArrayList<>();
        while (true) {
            int n = sc.nextInt();
            int count = 0;

            if (n == 0) {
                break;
            }

            for (int i = n + 1; i <= n * 2; i++) {
                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
            arr.add(count);


        }
        for (Object o : arr) {
            System.out.println(o);
        }


    }

}