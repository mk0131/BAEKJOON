import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList<>();

       int  n = sc.nextInt();

       for(int i = 0; i <n; i ++){
           int m = sc.nextInt();
           arr.add(m);
       }

        arr.sort(Comparator.naturalOrder());

        for (Object o : arr) {
            System.out.println(o);
        }
    }


}


