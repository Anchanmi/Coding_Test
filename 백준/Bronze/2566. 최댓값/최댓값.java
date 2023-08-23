import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[9][9];
		int max = 0;
		int maxRow = 0;
		int maxCol = 0;
		
		for(int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] >= 0 && arr[i][j] <= 100 && arr[i][j] > max) {
					max = arr[i][j];
					maxRow = i + 1;
					maxCol = j + 1;
				}
				
			}
		}
		
		if(max == 0) {
			System.out.println(max + "\n" + (maxRow + 1) + " " + (maxCol + 1));
		}
		else {
			System.out.println(max + "\n" + maxRow + " " + maxCol);
		}
		
	}

}