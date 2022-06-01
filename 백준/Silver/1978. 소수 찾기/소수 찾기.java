import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {

            boolean isPrime = true;

            int pn = in.nextInt();

            if (pn == 1) {    
                continue;
            }
            for (int j = 2; j <= Math.sqrt(pn); j++) {
                if (pn % j == 0) {
                    isPrime = false;    
                    break;
                }
            }
            if (isPrime) {   
                count++;
            }
        }
        System.out.println(count);
    }

}