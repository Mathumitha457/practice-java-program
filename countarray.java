import java.util.Scanner;
public class countarray {
   
public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the value");
        int size=src.nextInt();
        int arr[] =new int[3];
        int keyvalue=src.nextInt();
        int count=0;
       
        for (int i=0;i<size;i++) {
            arr[i]=src .nextInt();
            
             }
             for (int i=0;i<size;i++) {
                if(arr[i]<keyvalue)
                    count++;
                    
                
                
            }
            System.out.println(count);  
            }
            
        }
            
                

            
        
            
        
    
    


    
    

