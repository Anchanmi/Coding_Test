import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int price = 0;
		
		if(a > 0 && a < 7 && b > 0 && b < 7 && c > 0 && c < 7) {
			if(a == b && b == c && a == c) {
				price = 10000 + (a * 1000);
				System.out.println(price);
			}
			else if(a == b && a != c) {
				price = 1000 + (a * 100);
				System.out.println(price);
			}
			else if(a == c && a != b) {
				price = 1000 + (a * 100);
				System.out.println(price);
			}
			else if(b == c && a != c) {
				price = 1000 + (b * 100);
				System.out.println(price);
			}
			else {
				if(a > b && a > c) {
					price = a * 100;
					System.out.println(price);
				}
				else if(b > a && b > c) {
					price = b * 100;
					System.out.println(price);
				}
				else {
					price = c * 100;
					System.out.println(price);
				}
			}
		}
		sc.close();
	}
}