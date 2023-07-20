import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[3];
		
		if(a >= 100 && a < 1000 && b >= 100 && b < 1000) {
			int c = b;
			for(int i = 0; i < 3; i++) {
				arr[i] = c % 10;
				c /= 10;
				System.out.println(a * arr[i]);
			}
			System.out.println(a * b);
		}
		sc.close();
	}

}