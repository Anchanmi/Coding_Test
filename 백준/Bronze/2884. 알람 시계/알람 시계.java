import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cal = 0;
		
		if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			if(h == 0 && m < 45) {
				h = 24;
				cal = (h * 60 + m) - 45;
				System.out.println(cal/60 + " " + cal%60);
			}
			else if (m == 0) {
				m = 60;
				cal = (h * 60 + m) - 45;
				System.out.println(cal/60 + " " + cal%60);
			}
			else {
				cal = (h * 60 + m) - 45;
				System.out.println(cal/60 + " " + cal%60);
			}
			
		}
		sc.close();
	}

}