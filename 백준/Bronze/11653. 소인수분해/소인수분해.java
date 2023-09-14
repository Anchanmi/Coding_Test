import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		if(N > 0 && N <= 1.0E7) {
			int remain = N;
			
			if(N == 1) {
				System.out.println("");
			}
			
			for(int i = 2; i < N; i++) {
				
				if(remain % i == 0) {
					while(remain % i == 0) {
						list.add(i);
						remain /= i;
					}
				}
			}
			if(list.size() > 0) {
				for(int i : list) {
					System.out.println(i);
				}
			}
			else {
				if(N == 1) {
					System.out.println("");
				}
				else {
					System.out.println(N);
				}
			}
			
		}
	}

}