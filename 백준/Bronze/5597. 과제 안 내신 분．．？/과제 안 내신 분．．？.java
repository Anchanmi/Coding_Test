import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		int[] arr = new int[30];
		
		
		for(int i = 0; i < 28; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a >= 1 && a <= 30) {
				arr[a-1] = 1;
			}
		}
		for(int i = 0; i < 30; i ++) {
			if(arr[i] == 0) {
				str.append((i + 1) + "\n");
			}
		}
		
		System.out.println(str);
		
	}

}