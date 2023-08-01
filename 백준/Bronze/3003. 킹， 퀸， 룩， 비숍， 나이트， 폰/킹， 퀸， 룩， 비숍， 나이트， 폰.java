import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr1 = {1, 1, 2, 2, 2, 8};
		int[] arr2 = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i] - Integer.parseInt(st.nextToken());
			sb.append(arr2[i] + " ");
		}
		
		System.out.println(sb);
	}

}