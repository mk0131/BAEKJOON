import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList sum = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sum.add(n + m);
        }
        for (int i = 0; i < sum.size(); i++) {
            System.out.println(sum.get(i));
        }

        sc.close();
    }
}
