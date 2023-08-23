import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] Dpaper = new int[100][100];
		
		int Num = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(Num > 0 && Num <= 100) {
			for(int a = 0; a < Num; a++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int S_x = Integer.parseInt(st.nextToken());
				int S_y = Integer.parseInt(st.nextToken());
				
				for(int i = 0; i < 10; i++) {
					for(int j = 0; j < 10; j++) {
						Dpaper[S_x + i][S_y + j] = 1;
					}
				}
			}
			
			for(int i = 0; i < Dpaper.length; i++) {
				for(int j = 0; j < Dpaper[i].length; j++) {
					if(Dpaper[i][j] == 1) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}

}