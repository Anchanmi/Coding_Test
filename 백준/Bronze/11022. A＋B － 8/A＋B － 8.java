import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		
		long T = Long.parseLong(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a > 0 && a < 10 && b > 0 && b < 10) {
				int result = a + b;
				list.add("Case #" + (i + 1) + ": " + a + " + " + b + " = " + result);
			}
		}
		
		for(int i  = 0; i < list.size(); i++) {
			str.append(list.get(i) + "\n");
		}
		
		System.out.println(str);
		
	}

}