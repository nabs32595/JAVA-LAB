import java.util.*;
public class Lab2_Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rep;
        double f, c, ans, temp;
        
        System.out.println("1. Calculate Celsius : ");
        System.out.println("2. Calculate F : ");
        System.out.println("3. exit (anynumber) ");
        System.out.print("Enter your choise ");
        rep = scanner.nextInt(); 
           
        if (rep == 1){
        System.out.print("Enter temp in C: ");
        c = scanner.nextDouble();
        f = 1.8 * c + 32;        
        System.out.println(c + "Celcius =" + f + "F");            
        }  
        
        if(rep == 2){
        System.out.print("Enter temp in F: ");
        f = scanner.nextDouble();
        c = (5/9) * (f - 32);        
        System.out.println( f + "F =" + c + "Celsius");
        }  
        
    }
}
