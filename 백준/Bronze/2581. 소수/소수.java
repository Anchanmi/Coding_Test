import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		boolean flag = false; //소수 판별기 (true면 소수)
		
		if(M <= N && N <= 10000) {
			for(int i = M; i <= N; i++) {				
				if(i == 1) {
					continue;
				}
				
				flag = true;
				
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					list.add(i);
				}
			}
			
			if(list.size() > 0) {
				int sum = 0;
				
				for(int i : list) {
					sum += i;
				}
				
				System.out.println(sum);
				System.out.println(list.get(0));
			}
			else {
				System.out.println(-1);
			}
			
		}
	}

}