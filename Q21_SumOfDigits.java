import java.util.Scanner;

public class Q21_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

    
        int sum = 0;

        while (n > 0) {
            sum += n % 10;  
            n = n / 10;     
        }

        System.out.println(sum);

        sc.close();
    }
}


/*Output:
  Enter the number
    12345
    15
 */
