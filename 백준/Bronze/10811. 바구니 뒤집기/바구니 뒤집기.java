import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		
		if(N >= 1 && N <= 100 && M >= 1 && M <= 100) {
			for(int i = 0; i < N; i++) {
				list.add((i+1));
			}
			
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				if(a >= 1 && a <= b && b <= N) {
					Collections.reverse(list.subList((a-1), b));
				}
			}
			for(int i : list) {
				str.append(i + " ");
			}
			System.out.println(str);
		}
	}

}