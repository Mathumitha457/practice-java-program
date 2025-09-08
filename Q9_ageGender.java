import java.util.Scanner;
public class Q9_ageGender {
    

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

    
        System.out.print("Enter age: ");
        int age = src.nextInt();

        
        System.out.print("Enter Gender ");
        int Gender = src.nextInt();

    
        if (age < 25) {
            if (Gender==1){
                System.out.println("Group 1: Males under 25 years old");
            } else if (Gender == 2) {
                System.out.println("Group 2: Females under 25 years old");
            } else {
                System.out.println("Invalid gender code");
            }
        } 
        else if (age >= 25 && age <= 45) {
            if (Gender == 1) {
                System.out.println("Group 3: Males between 25 - 45 years old");
            } else if (Gender == 2) {
                System.out.println("Group 4: Females between 25 - 45 years old");
            } else {
                System.out.println("Invalid gender code");
            }
        } 
        else if (age > 45) {
            System.out.println("Group 5: All people over 45 years old");
        } 
        else {
            System.out.println("Invalid input");
        }

        src.close();
    }
}

    

