import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        
        if(a>0 && a<10 && b>0 && b<10){
            System.out.println(a/b);
        }
        sc.close();
	}

}