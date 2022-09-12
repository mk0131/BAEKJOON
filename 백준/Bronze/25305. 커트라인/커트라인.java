
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <n; i++){
            list.add(sc.nextInt());
        }

        list.sort(Comparator.reverseOrder());

        System.out.println(list.get(k-1));
    }
}
