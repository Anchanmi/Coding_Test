import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		if(N > 0 && N <= 1.0E6) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			int max = -1000000;
			int min = 1000000;
			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i]);
				min = Math.min(min, arr[i]);
			}
			str.append(min + " " + max);
			System.out.println(str);
		}
	}

}