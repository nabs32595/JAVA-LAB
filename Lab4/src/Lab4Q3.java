public class Lab4Q3 {
    public static void main( String[] args ) {
    Calculate cal1 = new Calculate();
    double owner1 = cal1.doaddition(50.0);
    System.out.println(owner1);
    }
}

class Calculate {    
    public double doaddition( double number){
    double result = 15 + number;    
    return result;
    }
}