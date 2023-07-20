import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a > 0 && a <10 && b > 0 && b < 10) {
				int result = a + b;
				list.add(result);
			}
			else if(a == 0 && b ==0) {
				break;
			}
		}
		
		for(int i = 0; i < list.size(); i ++) {
			str.append(list.get(i)).append("\n");
		}
		System.out.println(str);
	}

}