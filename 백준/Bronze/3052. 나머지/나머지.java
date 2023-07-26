import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[42];
		
		for(int i = 0; i < 10; i ++) {
			int a = Integer.parseInt(br.readLine());
			if(a > 0 && a <= 1000) {
				arr[a % 42]++;
			}
		}
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}