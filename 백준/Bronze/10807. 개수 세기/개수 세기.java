import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		if(N > 0 && N <= 100) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i] >= -100 && arr[i] <= 100) {
					continue;
				}else {
					break;
				}
			}
			
			int v = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			if(v >= -100 && v <= 100) {
				for(int i : arr) {
					if(v == i) {
						cnt++;
					}
				}
				System.out.println(cnt);
			}
			
		}
	}

}