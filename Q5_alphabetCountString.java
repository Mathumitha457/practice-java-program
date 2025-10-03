 import java.util.Scanner; 
 public class Q5_alphabetCountString {
   public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
        count++;
        }
        System.out.println(count);
        src.close();

    
}
}


/*Output:
HELLO WORLD
11
 */

    
