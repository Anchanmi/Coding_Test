import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 1; //증가 배수
		int j = 1;
		int cnt = 1;
		
		if(N >= 1 && N <= 1.0E9) {
			while(true) {
				if(N > i) {
					cnt++;
					i = i + (j * 6);
					j++;
					
				}
				else {
					break;
				}
			}
			System.out.println(cnt);
		}
	}

}