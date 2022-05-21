import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a = 10000001;
		int b = -10000001;
		var num =  new int [n]; 
		for(int i=0; i <n; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0;i <num.length; i ++) {
			if(num[i]<a ) {
				a = num[i];
			}
		}
		for(int i = 0;i <num.length; i ++) {
			if(num[i]>b ) {
				b = num[i];
			}
		}
		System.out.println(a +" "+b);
		
		sc.close();
	}

}
