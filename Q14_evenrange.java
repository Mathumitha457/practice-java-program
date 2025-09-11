import java.util.Scanner;
public class Q14_evenrange {
    public static void main(String[] args){
        Scanner src =new Scanner(System.in);
        System.out.println("enter the start number");
        int m=src.nextInt();
        System.out.println("enter the end number");
        int n=src.nextInt();
       for(int i=m;i<=n;i++){
        if(i%2==0){
             System.out.println(i);
        }
           

        }
            
            

            }
        }

   /* Output
        enter the start number:1
        enter the end number:10
        10
        2
        4
        6
        8
        10*/



