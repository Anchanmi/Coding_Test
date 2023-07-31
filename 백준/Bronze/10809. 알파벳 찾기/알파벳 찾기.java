import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String st = br.readLine();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		if(st.length() <= 100) {
			for(int i = 0; i < st.length(); i++) {
				arr[(st.charAt(i) - 97)] = st.indexOf(st.charAt(i));
			}
			for(int i : arr) {
				System.out.print(i + " ");
			}
		}
	}

}