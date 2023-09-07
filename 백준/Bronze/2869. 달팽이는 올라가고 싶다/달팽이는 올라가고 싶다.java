import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long day = Long.parseLong(st.nextToken());
		long night = Long.parseLong(st.nextToken());
		long distance = Long.parseLong(st.nextToken());
		
		if(1 <= night && night < day && day <= distance && distance <= 1.0E9) {
			
			long cnt = 0;
			
			long result = (distance - day) % (day - night);
			
			if(result == 0) {
				cnt = (distance - day) / (day - night) + 1;
			}
			else {
				cnt = (distance - day) / (day - night) + 2;
			}
			
			System.out.println(cnt);
		}
		
	}

}