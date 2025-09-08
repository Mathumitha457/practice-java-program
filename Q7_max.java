import java.util.Scanner;

public class Q7_max {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        int a = num.nextInt();
        
        System.out.println("Enter the value of b: ");
        int b = num.nextInt();
        
        System.out.println("Enter the value of c: ");
        int c = num.nextInt();
        
        int max;
        
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        
        System.out.println("Maximum number: " + max);
        
        num.close();
    }
}
