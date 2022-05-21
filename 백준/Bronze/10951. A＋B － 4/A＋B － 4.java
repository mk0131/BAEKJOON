import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b = 0;
        var arr = new ArrayList<>();

        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();

            arr.add(a + b);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        sc.close();

    }
}
