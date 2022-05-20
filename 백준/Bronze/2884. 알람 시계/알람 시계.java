import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int num3 = num2 - 45;

        if (num3 < 0) {
            num--;
            num3 = 60 + num3;
        }
        if (num < 0) {
            num = 23;
        }
        System.out.println(num + " " + num3);
    }
}
