import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "*";
        String sp = " ";

        for (int i = 1; i <= num; i++) {
            for (int j = num - 1; j >= 0; j--) {
                if (i > j) {
                    System.out.print(str);
                } else {
                    System.out.print(sp);
                }
            }
            System.out.println();
        }
    }
}
