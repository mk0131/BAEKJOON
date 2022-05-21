import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int prize = 0;

        if (num == num2 && num == num3) {
            prize = 10000 + num * 1000;
        } else if (num == num2 && num != num3) {
            prize = 1000 + (num) * 100;
        } else if (num == num3 && num != num2) {
            prize = 1000 + (num) * 100;
        } else if (num2 == num3 && num2 != num) {
            prize = 1000 + num2 * 100;
        } else if (num != num2 && num2 != num3 && num != num3) {
            if (num > num2 && num > num3) {
                prize = num * 100;
            } else if (num > num2 && num3 > num) {
                prize = num3 * 100;
            } else if (num2 > num && num2 > num3) {
                prize = num2 * 100;
            } else {
                prize = num3 * 100;
            }
        }

        System.out.println(prize);

        sc.close();
    }
}
