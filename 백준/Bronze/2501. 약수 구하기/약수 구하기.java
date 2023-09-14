import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		if(N > 0 && N <= 10000 && K > 0 && K <= N) {
			for(int i = 1; i <= N; i++) {
				if(N % i == 0) {
					list.add(i);
				}
			}
			
			if(K > list.size()) {
				System.out.println(0);
			}
			else {
				System.out.println(list.get((K - 1)));
			}
		}
		
	}

}