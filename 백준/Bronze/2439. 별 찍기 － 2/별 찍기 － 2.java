import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N > 0 && N <= 100) {
			for(int i = 1; i <= N; i++) {
				for(int j = N; j > i; j--) {
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		scan.close();
	}

}