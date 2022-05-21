import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "*";

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(str);
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
