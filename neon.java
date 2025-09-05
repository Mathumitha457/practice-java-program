 import java.util.Scanner;
 public class neon {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the number");
        int s=src.nextInt();
        int n=s*s;
        int sum=0;
         while(n>0){
            int dig=n%10;
        
            sum+=dig;
            n=n/10;
        }
        
    if(sum==s){
            System.out.print("neon number");
        }
        else{
            System.out.println("not neon number");
        }

      src.close();
    }}
    

