
import java.util.Arrays;
import java.util.Scanner;

public class Q12_descending {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter 4 numbers:");
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = src.nextInt();
         }
         Arrays.sort(arr);

          
        
    
        System.out.println("Descending order:");
        for (int i = 3; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        src.close();
    }
}
