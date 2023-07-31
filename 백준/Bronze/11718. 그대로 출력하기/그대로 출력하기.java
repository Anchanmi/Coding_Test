import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		String input = "";
		
		while((input = br.readLine()) != null) {
			if(input.isEmpty()) {
				break;
			}
			if(input.length() <= 100) {
				list.add(input);
			}
		}
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb);
		
	}

}