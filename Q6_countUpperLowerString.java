import java.util.Scanner;  
public class Q6_countUpperLowerString {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = src.nextLine();

        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }

        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
        src.close();
    }
}



/*Ouput:
Enter a string:
HELLo World
Uppercase letters: 5
Lowercase letters: 5
 */
