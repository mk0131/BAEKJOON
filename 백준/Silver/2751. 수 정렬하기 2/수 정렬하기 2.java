
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());

        }

        Collections.sort(list);

        for (int i : list) {
            sb.append(i).append('\n');
        }
        
        System.out.println(sb);

    }


}
