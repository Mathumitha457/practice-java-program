import java.util.Scanner;

public class Q22_HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");;
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;


        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (n % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }

        sc.close();
    }
}

/*Output:
Enter the number
    21
    Harshad Number

Enter the number
    28
    Not Harshad Number
 */
