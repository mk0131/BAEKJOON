import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var arr = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            arr.add(n + m);

            if (n == 0 && m == 0) {
                break;
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            System.out.println(arr.get(i));
        }
    }
}
