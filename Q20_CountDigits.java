import java.util.Scanner;

public class Q20_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        
        int n = sc.nextInt();

        
        n = Math.abs(n);

        
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }

        
        System.out.println(count);

        sc.close();
    }
}



/*Output:
 Enter the number
    1234567890
    10
 */
