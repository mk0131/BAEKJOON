package 입출력;

import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println((num + num2) % num3);
        System.out.println(((num % num3) + (num2 % num3)) % num3);
        System.out.println((num * num2) % num3);
        System.out.println(((num % num3) * (num2 % num3)) % num3);

        sc.close();
    }
}
