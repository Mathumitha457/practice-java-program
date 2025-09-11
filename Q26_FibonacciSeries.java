import java.util.Scanner;
 
public class Q26_FibonacciSeries {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}


/*Output:
  Enter number of terms: 5
    
  0 1 1 2 3
 */

    

