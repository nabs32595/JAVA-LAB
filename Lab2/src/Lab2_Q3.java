import java.text.*;
import java.util.*; 
class Lab2_Q3 {
    
    public static void main (String[] args){
        
    Scanner scanner = new Scanner(System.in);
    double cm, inch;
    

    System.out.print("Enter value in inch : ");
    inch = scanner.nextDouble();
    
    //convertion from inch to centimeter
    cm = inch * 2.54;
    
    //Display the result
    System.out.println(cm + "centimeter = " + inch + "inch");
    }
    
}