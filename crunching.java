 import java.util.Scanner;
public class crunching {
	public static void main (String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter the value");
		int n=src.nextInt();
		int step=0;
		while(n>0) {
			n=n/10;
					step++;
		}
		System.out.println(step);
        
		
	}

}
 
    
