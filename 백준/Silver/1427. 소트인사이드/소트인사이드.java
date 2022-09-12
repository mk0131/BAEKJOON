
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] arr = str.split("");

        Arrays.sort(arr, Comparator.reverseOrder());

        for (String s : arr) {
            System.out.print(s);
        }








    }
}
