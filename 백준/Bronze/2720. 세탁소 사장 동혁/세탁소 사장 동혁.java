import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int[][] money = new int[T][4];
		
		for(int i = 0; i < T; i++) {
			int cent = Integer.parseInt(br.readLine());
			if(cent > 0 && cent <= 500) {
				double dollar = cent * 0.01;
				
				money[i][0] = (int) (dollar / 0.25);
				dollar %= 0.25;
				dollar = Math.round(dollar * 100) / 100.00;
				
				money[i][1] = (int) (dollar / 0.10);
				dollar %= 0.10;
				dollar = Math.round(dollar * 100) / 100.00;
				
				money[i][2] = (int) (dollar / 0.05);
				dollar %= 0.05;
				dollar = Math.round(dollar * 100) / 100.00;
				
				money[i][3] = (int) (dollar / 0.01);
				
			}
			for(int j = 0; j < money[i].length; j++) {
				sb.append(money[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}