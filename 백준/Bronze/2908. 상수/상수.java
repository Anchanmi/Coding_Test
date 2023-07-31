import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sb = new StringTokenizer(br.readLine());
		
		char[] a1 = (sb.nextToken()).toCharArray();
		char[] b1 = (sb.nextToken()).toCharArray();
		
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		
		for(char i : a1) {
			list1.add(i);
		}
		for(char i : b1) {
			list2.add(i);
		}
		
		Collections.reverse(list1);
		Collections.reverse(list2);
		
		String a = "";
		String b = "";
		
		for(char i : list1) {
			a += String.valueOf(i);
		}
		for(char i : list2) {
			b += String.valueOf(i);
		}
		
		int Ia = Integer.parseInt(a);
		int Ib = Integer.parseInt(b);
		
		if(Ia > Ib) {
			System.out.println(Ia);
		}
		else {
			System.out.println(Ib);
		}
	}

}