import java.util.Scanner;

public class breakcontinue1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the number");
        int n = src.nextInt();
        int i;
        for(i=1;i<=n;i++){  
            if(i==4){
                continue;
            } 
            else{
                System.out.print(i);
            }         
        }

       src.close(); 
    }
    
}
