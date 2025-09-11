import java.util.Scanner;

public class Q6_maxmin {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        int a = src.nextInt();
        
        System.out.println("Enter the value of b: ");
        int b = src.nextInt();
        
        int maximum;
        int minimum;
        
        if (a >= b) {
            maximum = a;
            minimum = b;
        } else {
            maximum = b;
            minimum = a;
        }
        
        System.out.println("Maximum number: " + maximum);
        System.out.println("Minimum number: " + minimum);
        
        src.close();
    }
}
