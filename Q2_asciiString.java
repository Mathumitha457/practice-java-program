import java.util.Scanner;
public class Q2_asciiString {
    
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        String name=src.nextLine();
        String name1=src.nextLine();
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

    
}
}


/*Output
CSE
CSE
67029
67029
 */
