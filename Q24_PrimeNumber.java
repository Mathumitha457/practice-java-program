import java.util.Scanner;

public class Q24_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

        sc.close();
    }
}
/*Output:
Enter the number
    2
    Prime

Enter the number
    4
    Not Prime
*/



