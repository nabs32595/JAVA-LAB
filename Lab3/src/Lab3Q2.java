import java.util.*;
public class Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalSale, seatA, priceA, seatB, priceB, seatC, priceC;
        
        System.out.print("Number of A seats sold:");
        seatA = scanner.nextDouble();
        
        System.out.print("Price of an A ticket:");
        priceA = scanner.nextDouble();
        
        System.out.print("Number of B seats sold:");
        seatB  = scanner.nextDouble();
        
        System.out.print("Price of an B ticket:");
        priceB = scanner.nextDouble();
        
        System.out.print("Number of C seats sold:");
        seatC  = scanner.nextDouble();
        
        System.out.print("Price of an C ticket:");
        priceC = scanner.nextDouble();
        
        totalSale = (seatA * priceA) + (seatB * priceB) + ( seatC * priceC);
        
        System.out.print("Total sale is:" + totalSale );
        

    }
    
}
