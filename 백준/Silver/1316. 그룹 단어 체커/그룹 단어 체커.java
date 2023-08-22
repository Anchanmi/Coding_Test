import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N <= 100) {
			int cnt = 0;
			
			for(int a = 0; a < N; a++) {
				char[] arr = (br.readLine()).toCharArray();
				
				boolean flag = true;
				
				Otter : for(int i = 0; i < arr.length; i++) {
					for(int j = i; j < arr.length; j++) {
						if(arr[i] == arr[j]) {
							continue;
						}
						else {
							for(int k = (j + 1); k < arr.length; k++) {
								if(arr[i] != arr[k]) {
									continue;
								}
								else {
									flag = false;
									break Otter;
								}
							}
						}
					}
				}
				
				if(flag) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}