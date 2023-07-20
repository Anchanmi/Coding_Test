import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int result = 0;
		
		if(X >= 1 && X <= 1.0E9 && N >=1 && N <= 100) {
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(a >= 1 && a <= 1.0E6 && b >= 1 && b <= 10) {
					result += a * b;
				}
			}
			if(X == result) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}