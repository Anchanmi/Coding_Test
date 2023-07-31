import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		if(T > 0 && T <= 1000) {
			for(int i = 0; i < T; i ++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int R = Integer.parseInt(st.nextToken());
				String S = st.nextToken();
				
				if(R >= 1 && R <= 8 && S.length() >= 1 && S.length() <= 20) {
					for(int j = 0; j < S.length(); j++) {
						sb.append(String.valueOf(S.charAt(j)).repeat(R));
					}
					sb.append("\n");
				}
			}
			System.out.println(sb);
		}
	}

}