 import java.util.Scanner;

public class vote {
	public static void main (String args[]) {
		Scanner src = new Scanner(System.in);
		System.out.println("enter age value");
		int age= src.nextInt();
		
		if(age>=18) {
			System.out.println("eligible");
		}
			else {
				System.out.println("not eligible");
				src.close();
			}
		}
	
}
 
    

