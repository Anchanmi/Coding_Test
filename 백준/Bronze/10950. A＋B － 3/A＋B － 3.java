import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > 0 && a < 10 && b > 0 && b < 10) {
				arr[i] = a + b;
			}
		}
		for(int i = 0; i < t; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}