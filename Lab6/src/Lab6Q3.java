import java.text.DecimalFormat;
import java.util.*;
public class Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int savings, month;
        double current =0;
        char ans;
        
        do{
            System.out.println("::ANNUAL INTEREST CALCULATION::");
            System.out.println(":Enter monthly saving: RM ");
            savings = scanner.nextInt();

            System.out.println("Enter duration in month: ");
            month = scanner.nextInt();

            for (int i = 1; i <= month; i++){
            System.out.println("Month" + i);

            current = (current + savings) * 1.00417;    

            System.out.println("current" + df.format(current));

            }
            
        System.out.println("Press [Y] to continue ");
        ans = scanner.next().charAt(0);
        }while(ans == 'y' || ans == 'Y'); 
        
    }
}
