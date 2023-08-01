import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N >= 1 && N <= 100) {
			for(int i = 0; i < N; i++) {
				for(int j = i; j < (N-1); j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < (2 * i) + 1 ; k ++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			for(int a = 0; a < (N - 1); a++) {
				for(int b = 0; b <= a; b++) {
					System.out.print(" ");
				}
				for(int c = 0; c < (2 * N) - ((2 * a) + 3); c++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		sc.close();
	}

}