import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long X = Long.parseLong(br.readLine());
		int num = 1; //분자 값
		int deno = 2; //분모 값
		int i = 2; //분모 변화
		int cnt = 2; //변동 횟수
		
		if(X >= 1 && X <= 1.0E7) {
			
			while(true) {
				if(X == 1) {
					num = 1;
					i = 1;
					break;
				}
				if(X == 2) {
					num = 1;
					i = 2;
					break;
				}
				
				if(deno % 2 == 0) {
					num++;
					i--;
					cnt++;
					
					if(cnt == X) {
						break;
					}
					
					if(i == 1) {
						i = 0;
						num = ++deno + 1;
					}
				}
				else {
					num--;
					i++;
					cnt++;
					
					if(cnt == X) {
						break;
					}
					
					if(num == 1) {
						i = ++deno + 1;
						num = 0;
					}
				}
			}
			System.out.println(num + "/" + i);
			
		}
	}

}