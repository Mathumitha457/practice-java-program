import java.util.Scanner;
class Q1_evenodd {
    public static void main(String[] args) {
        Scanner Src = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Src.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        Src.close();
        
    }
}
/*output:
    Enter a number: 4
    Even
    Enter a number: 7
    Odd
 */