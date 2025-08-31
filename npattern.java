 import java.util.Scanner;

public class npattern {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= src.nextInt();
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
        src.close();
	}
}
			
				 


 
    

