import java.util.Scanner;
public class Q2_posneg {
    

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        int a = num.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else{ 
            System.out.println("negative");
        }
       
        num.close();

        
        
    
}
}

    //Output:
   // Enter the value of a:23
   // positive

    //Enter the value of a:-23
    //negative