import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase();
		int N = str.length();
		int[] arr = new int[26];
		
		if(N <= 1.0E6) {
			for(int i = 0; i < N; i++) {
				arr[str.charAt(i)-65] += 1;
			}
			
			int max = 0;
			int maxIndex = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
					maxIndex = i;
				}
			}
			int cnt = 0;
			for(int i : arr) {
				if(i == max) {
					cnt++;
				}
			}
			
			if(cnt == 1) {
				maxIndex = maxIndex + 65;
				char answer = (char) maxIndex;
				System.out.println(answer);
			}
			else {
				System.out.println("?");
			}
		}
	}

}