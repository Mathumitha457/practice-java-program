import java.util.Scanner;
public class numberpattern {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the number");
        int n=src.nextInt();
        int num=1;
        for(int row=1;row<=n;row++){
        for (int col=1;col<=row;col++){
            System.out.print(num%10);
            num++;
         
        }
        System.out.println();
       
    }
    

        }
}
    

