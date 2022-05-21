import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if ((num2 + num3) % 60 == 0) {
            int h = (num2 + num3) / 60;
            num += h;
            num2 = 0;
        } else if (num2 + num3 > 59) {
            int h = (num2 + num3) / 60;
            num += h;
            num2 = (num2 + num3) - (60 * h);
        } else if (num2 + num3 < 60) {
            num2 = num2 + num3;
        }

        if (num >= 24) {
            num = num - 24;
        }

        System.out.println(num + " " + num2);
        sc.close();
    }
}
