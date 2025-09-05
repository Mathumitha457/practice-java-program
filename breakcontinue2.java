
import java.util.Scanner;
public class breakcontinue2 {
 public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the number");
        int n = src.nextInt();
        int i;
        int m=n;
        while(m>0){
        for(i=1;i<=n;i++){  
            if(i==4){
                break;
            } 
            else{
                System.out.print(i);
            }         
        }
        System.out.println();
        m--;
    }
       src.close(); 
    }
    
}

    

