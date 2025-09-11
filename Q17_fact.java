import java.util.Scanner;

public class Q17_fact {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = src.nextInt();
        int fact=1;
        for (int i=5; i>1; i--){
            fact=fact*i;
            

        }
        System.out.println(fact);

    }
}

        