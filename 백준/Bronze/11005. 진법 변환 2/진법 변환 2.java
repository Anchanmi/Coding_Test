import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(N <= 1.0E9 && B >= 2 && B <= 36) {
			int remain; //나머지
			
			while(N >= B) {
				remain = N % B;
				
				if(remain >= 0 && remain <= 9) {
					sb.insert(0, remain);
				}
				else if(remain >= 10 && remain <= 35) {
					sb.insert(0, (char) (remain + 55));
				}
				
				N /= B;
			}
			
			if(N >= 0 && N <=9) {
				sb.insert(0, N);
			}
			else if(N >= 10 && N <= 35) {
				sb.insert(0, (char) (N + 55));
			}
			
			System.out.println(sb);
		}
	}

}