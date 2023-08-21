import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int N = st.length();
        
        if(N == 1){
            System.out.println(1);
        }
		
		for(int i = 1; i <= (N / 2); i++) {
			if(st.charAt(i - 1) == st.charAt(N - i)) {
				
				if(i == (N / 2)) {
					System.out.println(1);
				}
				
				continue;
				
			} else {
				System.out.println(0);
				break;
			}
		}
		
	}

}