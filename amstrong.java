
import java.util.Scanner;
public class amstrong {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.println("enter the number");
        int n = src.nextInt();
        int original=n;
        int sum=0;
        int digit=0;
        while(n>0){
            n=n%10;
            sum+=(digit*digit*digit);
            n=n/10;
        }
        if(n==original){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not amstrong number");
        }

        

    }
}