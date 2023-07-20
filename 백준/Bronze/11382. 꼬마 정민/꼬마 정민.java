import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        if(a>=1 && a <= 1.0E12 && b>=1 && b<=1.0E12 && c>=1 && c<=1.0E12){
            System.out.println(a+b+c);
        }
        sc.close();
    }
}