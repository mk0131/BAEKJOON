import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        if (num > 0 && num2 > 0) {
            System.out.println(1);
        } else if (num < 0 && num2 > 0) {
            System.out.println(2);
        } else if (num < 0 && num2 < 0) {
            System.out.println(3);
        } else if (num > 0 && num2 < 0) {
            System.out.println(4);
        }
    }
}
