import java.util.Scanner;

public class Q25_PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        int sqrt = (int) Math.sqrt(number);

        
        if (sqrt * sqrt == number) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }

        sc.close();
    }
}

/*Output
 Enter a number: 25
    Perfect Square

 Enter a number: 20
     Not Perfect Square
 */
