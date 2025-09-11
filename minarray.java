import java.util.Scanner;

public class minarray {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the value");
        int size=src.nextInt();
        int arr[] =new int[3];
        int min=Integer.MAX_VALUE;
        
        for (int i=0;i<size;i++) {
            arr[i]=src .nextInt();
            if(min>arr[i]){
                min=arr[i];
               
            } }
             System.out.print(min);
            
                
                src.close();

            }
        
            
        }
    

