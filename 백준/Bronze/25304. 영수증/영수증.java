import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int n = sc.nextInt();

        int sum = 0;

        int[] price = new int[n];
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
            count[i] = sc.nextInt();

            sum += price[i] * count[i];
        }

        if (x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
