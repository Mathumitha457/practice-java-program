import java.util.Scanner;
public class Q15_sumEven {
    public static void main(String[] args){
        Scanner src =new Scanner(System.in);
        System.out.println("enter the start number");
        int m=src.nextInt();
        System.out.println("enter the end number");
        int n=src.nextInt();
        int sum=0;
       for(int i=m;i<=n;i++){
        if(i%2==0){
            sum=sum+i;
             System.out.println(sum);
        }
           

        }
            
            

            }
        }