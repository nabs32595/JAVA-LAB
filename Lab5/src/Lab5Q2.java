import java.util.*;
public class Lab5Q2 {
    public static void main(String[] args) {
        
    double current_balance, savings_balance;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter current value:");
    current_balance = scan.nextDouble();
    
    System.out.println("Enter savings value:");
    savings_balance = scan.nextDouble();
    
    if(current_balance < 10.00){
     System.out.println("Current account balance is low");   
    }
    
    if(savings_balance < 100.00){
     System.out.println("Saving account balance is low");   
    }
    
    if(current_balance < 10.00 && savings_balance < 100.00){
       System.out.println("Both account is dangerously low"); 
    }
    
    
        
}
}
