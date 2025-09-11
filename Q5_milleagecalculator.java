 import java.util.Scanner; 
 public class Q5_milleagecalculator {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double start = sc.nextDouble();
        double end = sc.nextDouble();

    
        double distance = end - start;

    
        double remuneration = distance * 25;


        System.out.printf("%.2f %.2f", distance, remuneration);

        sc.close();
    }
}



/*Output:
        13505.2 13810.6
        305.40 7635.00
        */

    

