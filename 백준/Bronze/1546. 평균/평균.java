import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double M = 0;
		
		if(N > 0 && N <= 1000){
			double[] arr = new double[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i] > 0 && arr[i] <= 100) {
					M = Math.max(M, arr[i]);
				}
			}
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (double)arr[i] / M * 100;
			}
			
			double sum = 0;
			
			for(double i : arr) {
				sum += i;
			}
			
			double avg = sum / N;
			
			System.out.println(avg);
		}
	}

}