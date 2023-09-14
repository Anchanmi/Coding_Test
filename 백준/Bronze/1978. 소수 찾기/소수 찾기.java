import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		boolean flag; //소수 판별기(소수 이면 true)
		
		if(N <= 100 && N > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num == 1) {
					continue;
				}
				
				flag = true;
				
				for(int j = 2; j < num; j++) {
					if(num % j == 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					list.add(num);
				}
			}
			System.out.println(list.size());
		}
		
	}
}