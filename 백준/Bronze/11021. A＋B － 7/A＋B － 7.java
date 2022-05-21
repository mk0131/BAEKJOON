import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList sum = new ArrayList<>();
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum.add(a + b);
        }

        for (int i = 0; i < sum.size(); i++) {
            System.out.println("Case #" + (i + 1) + ": " + sum.get(i));
        }
    }
}
