import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(N >= 1 && N <= 100 && M >= 1 && M <= 100) {
			int[] arr = new int[N];
			
			for(int i = 0; i < N; i++) {
				arr[i] = (i+1);
			}
			
			int temp = 0;
			
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				temp = arr[a-1];
				arr[a-1] = arr[b-1];
				arr[b-1] = temp;
			}
			
			for(int i : arr) {
				str.append(i + " ");
			}
			System.out.println(str);
		}
	}

}