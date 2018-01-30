import java.util.*;
public class Lab6Q1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   
    double num, total = 0 , avg;
    
        for (int i= 0; i < 10; i++){
        System.out.println("Enter number ");
        num = scanner.nextDouble();        
        total = num + total;        
        }
        
        avg = total/ 10;
        System.out.println("Average is: " + avg);
        
        
        
        
        
    }
}
