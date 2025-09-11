
import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the value");
        int size=src.nextInt();
        int arr[] =new int[3];
        int max=Integer.MIN_VALUE;
        
        for (int i=0;i<size;i++) {
            arr[i]=src .nextInt();
            if(max<arr[i]){
                max=arr[i];
               
            } }
             System.out.print(max);
            
                
                src.close();

            }
        
            
        }
    


    

