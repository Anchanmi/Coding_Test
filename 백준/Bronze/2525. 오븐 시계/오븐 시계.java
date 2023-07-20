import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cal = 0;
		
		if(a >= 0 && a <= 23 && b >= 0 && b <= 59 && c >= 0 && c <= 1000) {
			cal = (a * 60 + b) + c;
			if(cal/60 >= 24) {
				System.out.println(((cal/60)- 24) + " " + (cal % 60));
			}
			else {
				System.out.println(cal/60 + " " + (cal % 60));
			}
		}
		sc.close();
	}

}