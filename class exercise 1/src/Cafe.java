import java.util.*;

public class Cafe {
public static void main(String[] args) {
   int choice,qty; 
   Scanner scan = new Scanner(System.in);
   
   System.out.println("1. Cafe Mocha    RM1.99");
   System.out.println("2. Cafe Latte    RM1.99");
   System.out.println("3. Espresso      RM2.49");
   System.out.println("4. Green Tea     RM0.99");
   System.out.println("Enter choice");
   choice = scan.nextInt();
   System.out.println("Enter quantity");
   qty = scan.nextInt();
   menu menu = new menu(qty,choice);
   menu.calculate();   
   System.out.println("then total " + menu.getTotal());
}
    
}

class menu {
    private int choice, qty;
    private String name;
    private double price, total;

    public menu(int qty, int choice) {
        this.qty = qty;
        this.choice = choice;
    }
    
    void calculate(){
        if(choice == 1){
            name = "Cafe Mocha";
            price = 1.99;
        }
        if(choice == 2){
            name = "Cafe Latte";
            price = 1.99;
        }
        if(choice == 3){
            name = "Espresso";
            price = 2.49;
        }
        if(choice == 4){
            name = "Green Tea";
            price = 0.99;
        }
    total = qty * price;    
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }    
}