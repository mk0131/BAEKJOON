import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        var arr = new int[n];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            arr[i] = l;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < m) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
