package 입출력;

import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num2 % 10;
        int sum2 = (num2 % 100) / 10;
        int sum3 = (num2 % 1000) / 100;

        System.out.println(num * sum);
        System.out.println(num * sum2);
        System.out.println(num * sum3);
        System.out.println(num * num2);

        sc.close();
    }
}
