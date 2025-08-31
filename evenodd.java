import java.util.Scanner;
class evenodd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
/*output:
    Enter a number: 4
    Even
    Enter a number: 7
    Odd
 */