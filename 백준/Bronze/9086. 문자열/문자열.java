import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		if(T > 0 && T <= 10) {
			for(int i = 0; i < T; i++) {
				String str = br.readLine();
				sb.append(str.charAt(0) + "" + str.charAt(str.length()-1) + "\n");
			}
			System.out.println(sb);
		}
	}

}