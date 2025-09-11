import java.util.Scanner;

public class Q16_sumoddeven {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int n = src.nextInt();

        System.out.println("Enter the ending number:");
        int m = src.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for(int i = n; i <= m; i++){
            if(i % 2 == 0){
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}

/*Output:
Enter the starting number:
1
Enter the ending number:
10
Sum of even numbers: 30
Sum of odd numbers: 25
 */

           
            
            

            
        