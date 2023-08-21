import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = str.toCharArray();
		
		if(str.length() <= 100) {
			
			for(int i = 0; i < arr.length; i++) {
				if(i > 0 && arr[i] == '=') {
					if(arr[i-1] == 'c' || arr[i-1] == 's') {
						arr[i-1] = 0;
					}
					else if(arr[i-1] == 'z') {
						if(i > 1 && arr[i-2] == 'd') {
							arr[i-2] = 0;
							arr[i-1] =0;
						} else {
							arr[i-1] =0;
						}
					}
				}
				
				if(i > 0 && arr[i] == 'j') {
					if(arr[i-1] == 'n' || arr[i-1] == 'l') {
						arr[i-1] = 0;
					}
				}
				
				if(i > 0 && arr[i] == '-') {
					if(arr[i-1] == 'c' || arr[i-1] == 'd') {
						arr[i-1] = 0;
					}
				}
			}
			int cnt = 0;
			
			for(char i : arr) {
				if(i > 44) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}