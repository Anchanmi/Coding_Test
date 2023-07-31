import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		if(S.length() <= 1000) {
			int a = Integer.parseInt(br.readLine());
			System.out.println(S.charAt(a-1));
		}
	}

}
