import java.util.*;
import java.math.*;
public class Lab4Q3Mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,result;
        
        System.out.print("Enter A: ");
        a = scanner.nextDouble();
        
        System.out.print("Enter B: ");
        b = scanner.nextDouble();
        

        result = math.pow(a,3) + math.sqrt(b) / 3;
        
        System.out.print("Result is: " + result);
        
    }
}