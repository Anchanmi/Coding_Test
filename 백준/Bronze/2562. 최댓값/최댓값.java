import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}
		
		System.out.println(max);
		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(max)+1);
	}

}