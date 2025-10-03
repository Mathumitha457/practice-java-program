 import java.util.Scanner; 
 public class Q1_charNewLineString {
    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        String s=src.nextLine();
         for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        src.close();
    }
}



/*Output
hello
h
e
l
l
o
 */

        
        

        
    
    

