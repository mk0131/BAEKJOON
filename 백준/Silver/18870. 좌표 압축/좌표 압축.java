import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] list = new int[n];

        HashMap<Integer, Integer> rank = new HashMap<>();

        for (int i = 0; i < n; i++) {
            list[i] = arr[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ranked = 0;
        for(int i : list){
            if(!rank.containsKey(i)){
                rank.put(i,ranked);
                ranked++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int key : arr){
            int ranking = rank.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);

    }
}
