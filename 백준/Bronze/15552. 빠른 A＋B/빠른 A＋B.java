import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int arr[];
		
		if(T > 0 && T <= 1.0E6) {
			arr = new int[T];
			for(int i = 0; i < T; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				if(a >= 1 && a <= 1000 && b >= 1 && b <= 1000) {
					arr[i] = a + b;
				}
			}
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for(int i = 0; i < T; i++) {
				bw.write(String.valueOf(arr[i])+"\n");
			}
			bw.flush();
			bw.close();
		}
		
	}

}
