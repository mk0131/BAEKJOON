import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String[] results = Arrays.stream(arr).distinct().toArray(String[]::new);

        Arrays.sort(results, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }


            }
        });

        for (String s : results) {
            System.out.println(s);
        }


    }
}
