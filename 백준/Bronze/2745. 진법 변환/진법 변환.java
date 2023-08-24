import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int N_cnt = N.length();
		int B = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i = N_cnt-1; i >= 0; i--) {
			if(N.charAt(i) >= 48 && N.charAt(i) <= 57) {
				sum += (N.charAt(i) - 48) * Math.pow(B, Math.abs(i-(N_cnt-1)));
			}
			else {
				sum += (N.charAt(i) - 55) * Math.pow(B, Math.abs(i-(N_cnt-1)));
			}
		}
		
		System.out.println(sum);
	}

}