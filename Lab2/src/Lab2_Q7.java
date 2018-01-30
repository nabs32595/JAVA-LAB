import java.util.*; 

public class Lab2_Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,calories;
        
        System.out.print("Enter Weight : ");
        weight = scanner.nextDouble();
        
        calories = weight * 19;
                
        System.out.print("you require " + calories + " perday");       
        
    }
    
}
