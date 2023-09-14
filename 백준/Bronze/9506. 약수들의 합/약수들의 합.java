import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			ArrayList<Integer> list = new ArrayList<>();
			int num = Integer.parseInt(br.readLine());
			
			if(num > 2 && num < 100000) {
				int sum = 0;
				
				for(int i = 1; i <= num; i++) {
					if(num % i == 0) {
						list.add(i);
						if(i < num) {
							sum += i;
						}
					}
				}
				
				if(num == sum) {
					sb.append(num + " = ");
					for(int i = 0; i < (list.size() - 1); i++) {
						if(i < (list.size() - 2)) {
							sb.append(list.get(i) + " + ");
						}
						else {
							sb.append(list.get(i) + "\n");
						}
					}
				}
				else {
					sb.append(num + " is NOT perfect." + "\n");
				}
				
			}
			if(num == -1) {
				break;
			}
		}
		System.out.println(sb);
	}

}