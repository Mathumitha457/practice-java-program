 import java.util.Scanner;
public class Q3_divisible {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int i=src.nextInt();
		if(i%3==0 && i%5==0) {
			System.out.println("divisible by 3 and 5");
		}
		else {
			System.out.println("not divisible by 3 and 5");
		}
			src.close();
		}
	}


 
    

