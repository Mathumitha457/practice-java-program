import java.util.Scanner;
public class Q8_posneg {
    

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        int a = num.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
        num.close();

        
        
    
}
}
