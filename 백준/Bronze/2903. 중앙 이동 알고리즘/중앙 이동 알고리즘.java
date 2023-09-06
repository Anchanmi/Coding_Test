import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int exPoint = 2; //기존의 점 개수.
		int totalPoint = 4; //전체 점의 개수.
		
		for(int i = 0; i < N; i++) {
			int newPoint = exPoint - 1; // 한 번의 과정을 거친 후 새로 생긴 점의 개수.
			exPoint += newPoint; //한 번의 과정이 지난 후 한 줄에 있는 점의 개수.
			totalPoint = (int) Math.pow(exPoint, 2);
		}
		System.out.println(totalPoint);
	}

}