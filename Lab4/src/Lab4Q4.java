import java.util.*;
public class Lab4Q4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double rm;
    int reply;    
   
        System.out.println("[1] Singapore Dollar ");
        System.out.println("[2] Indonesia Rupiah");
        System.out.println("[3] Saudi Riyal");
        System.out.println("Enter RM");
        rm = scanner.nextDouble();      
        Currency convert = new Currency(rm);  
        System.out.println("Enter selection");
        reply = scanner.nextInt();
        
        do{
            
        if(reply == 1){
        System.out.println("RM" + rm + " = " + convert.Singapore( ) );    
        }

        if(reply == 2){
        System.out.println("RM" + rm + " = " + convert.Indonesia( ) );    
        }

        if(reply == 3){
        System.out.println("RM" + rm + " = " + convert.Saudi( ) );    
        }
        
        else{
        System.out.println("wrong selection");
        }
        
        System.out.println("Enter selection");
        reply = scanner.nextInt();     
    
        }while (reply != 0);       
        
    }
}


class Currency{
private final double rm;

    Currency(double rm){
    this.rm = rm;
    }
    
    public double Singapore( ){
    return rm * 0.32;
    }

    public double Indonesia( ){
    return rm * 3242.13;
    }

    public double Saudi( ){
    return rm * 0.90;
    }
}