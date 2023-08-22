import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float sum1 = 0; //(학점 * 과목평점) 총합
		float sum2 = 0; //학점 총합
		int cnt = 0; //P의 개수
		
		for(int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			float credit = Float.parseFloat(st.nextToken());
			String grade = st.nextToken();
			
			if(subject.length() >= 1 &&  subject.length() <= 50 
					|| credit == 1.0 || credit == 2.0 || credit == 3.0 || credit == 4.0 ) {
				
				sum2 += credit;
				
				switch(grade) {
					case "A+":
						sum1 += credit * (4.5);
						break;
					case "A0":
						sum1 += credit * (4.0);
						break;
					case "B+":
						sum1 += credit * (3.5);
						break;
					case "B0":
						sum1 += credit * (3.0);
						break;
					case "C+":
						sum1 += credit * (2.5);
						break;
					case "C0":
						sum1 += credit * (2.0);
						break;
					case "D+":
						sum1 += credit * (1.5);
						break;
					case "D0":
						sum1 += credit * (1.0);
						break;
					case "F":
						sum1 += 0;
						break;
					case "P":
						sum2 -= credit;
						cnt++;
						break;
				}
				
				if(cnt == 20) {
					break;
				}
				
			}
			
		}
		
		float avg = sum1 / sum2;
		System.out.printf("%.6f", avg);
		
	}

}