import java.util.Scanner;

public class Q10_SBICreditCardEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter age of primary applicant: ");
        int primaryAge = sc.nextInt();

        System.out.print("Enter age of add-on card applicant: ");
        int addonAge = sc.nextInt();

        System.out.print("Enter employment type (1-Salaried, 2-Self-employed, 3-Student, 4-Retired pensioner): ");
        int empType = sc.nextInt();

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        if (primaryAge >= 21 && primaryAge <= 60 &&
            addonAge >= 18 &&
            empType >= 1 && empType <= 4 &&
            income <= 300000) {
            
            System.out.println("Yes. You are eligible for SBI credit cards");
        } else {
            System.out.println("No. You are not eligible for SBI credit cards");
        }

        sc.close();
    }
}

/*Output:
 Enter age of primary applicant: 45
Enter age of add-on card applicant: 20
Enter employment type (1-Salaried, 2-Self-employed, 3-Student, 4-Retired pensioner): 2
Enter annual income: 300000
Yes. You are eligible for SBI credit cards
 */
