import java.util.Scanner;

public class Q11_shape {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("equilateral triangle");
        }
        else if(a==b && b==c && a!=c){
            System.out.println("scalene triangle");
        }
        else{
            if(a!=b && b!=c && c!=a){
            System.out.println("isoleus triangle");
        }
    }


        
    }
}

