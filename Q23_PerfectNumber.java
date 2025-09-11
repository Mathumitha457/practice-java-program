import java.util.Scanner;

public class Q23_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");;
        int n = sc.nextInt();
        int sum = 0;

        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }

        sc.close();
    }
}

/*Output:
    Enter the number
        28
        Perfect Number

    Enter the number
        12
        Not Perfect Number
        */