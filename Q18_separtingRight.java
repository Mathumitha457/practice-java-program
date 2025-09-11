
import java.util.Scanner;

public class Q18_separtingRight {
	public static void main (String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter the value");
		int n=src.nextInt();
		int dig=0 ;
		while(n>0) {
			dig=n%10;
			System.out.println(dig);
			n=n/10;
				
		}
		src.close();

		
	}

}
