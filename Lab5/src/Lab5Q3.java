import java.util.*;
public class Lab5Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int year;
        
        System.out.println("Enter Year");
        year = scan.nextInt();
        
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        System.out.println("The Year" + year + " is a leap year");
            
        }else {
            
        System.out.println("The Year" + year + " is not leap year");
        }   

    }
}