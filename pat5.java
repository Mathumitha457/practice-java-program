import java.util.Scanner;
public class pat5 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the number");
        int n=src.nextInt();
        
        for(int row=1;row<=n;row++){
        for (int col=1;col<=n;col++){
            System.out.print(col+" ");
            
         
        }
        System.out.println();
       
    }
    src.close();
    

        }
}
    

