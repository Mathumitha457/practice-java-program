import java.util.Scanner;
public class sumarray {
   
public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the value");
        int size=src.nextInt();
        int arr[] =new int[3];
        int sum=0;
        for (int i=0;i<size;i++) {
            arr[i]=src .nextInt();
            sum=sum+arr[i];
        }
            
                System.out.print(sum);

            }
        
            
        }
    
    

