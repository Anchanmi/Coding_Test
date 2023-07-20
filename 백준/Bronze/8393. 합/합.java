import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		if(n > 0 && n <= 10000) {
			for(int i = 1; i <= n; i++) {
				result += i;
			}
			System.out.println(result);
		}
		sc.close();
	}

}