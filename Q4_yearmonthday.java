import java.util.Scanner;
 public class Q4_yearmonthday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int days = sc.nextInt();

    
        int years = days / 365;
        int rem = days % 365;
        int months = rem / 30;
        int daysLeft = rem % 30;


        System.out.println("Years:" + years);
        System.out.println("Months:" + months);
        System.out.println("Days:" + daysLeft);

        sc.close();
    }
}



/*Output
    400
Years:1
Months:1
Days:5
*/


    

