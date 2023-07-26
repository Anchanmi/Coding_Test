import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder str = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 10000 && X >= 1 && X <= 10000) {
			int[] arr = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int cnt = 0;
			
			for(int i : arr) {
				if(X > i) {
					str.append(i + " ");
					cnt++;
				}
			}
			if(cnt > 0) {
				System.out.println(str);
			}
		}
		
	}

}