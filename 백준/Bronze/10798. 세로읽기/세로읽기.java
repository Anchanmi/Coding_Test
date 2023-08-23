import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] arr = new char[5][];
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine().toCharArray();
			if(arr[i].length > max && max <= 15) {
				max = arr[i].length;
			}
		}
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].length > i) { //행의 길이가 i보다 크면 아예 안읽음.
					sb.append(arr[j][i]);
				}
			}
		}
		System.out.println(sb);
	}

}