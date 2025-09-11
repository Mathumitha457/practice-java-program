import java.util.Scanner;
public class searcharray {
   
public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the value");
        int size=src.nextInt();
        int arr[] =new int[3];
       int searchele=src.nextInt();
        int i;
        boolean found=false;
        for ( i=0;i<size;i++) {
            arr[i]=src .nextInt();
            
             }
             for ( i=0;i<size;i++) {
                if(searchele==arr[i]){
                    found=true;
                    break;
                }

             }
             if (found)
             System.out.println(i);
             else
             System.out.println(-1);
             
             
        

            }
            
        }
            
                

            
        
            
        
    
    

