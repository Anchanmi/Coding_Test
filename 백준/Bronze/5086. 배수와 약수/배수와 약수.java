import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if(num1 <= 10000 && num2 <= 10000 && num1 >= 0 && num2 >= 0) {
				if(num1 < num2) {
					if(num2 % num1 == 0) {
						sb.append("factor" + "\n");
					}
					else {
						sb.append("neither" + "\n");
					}
				}
				else if(num1 > num2) {
					if(num1 % num2 == 0) {
						sb.append("multiple" + "\n");
					}
					else {
						sb.append("neither" + "\n");
					}
				}
				else if(num1 == 0 && num2 == 0) {
					break;
				}
			}
		}
		System.out.println(sb);
	}

}