import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] re = new int[10];
		int count = 0;

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			re[i] = arr[i] % 42;

		}
		
		for(int i =0; i <re.length; i++) {
			int tem = -1;
			for(int j = i; j<re.length; j++) {
				if(re[i] == re[j]) {
					tem++;
				}
			}
			if(tem ==0) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();

	}

}
