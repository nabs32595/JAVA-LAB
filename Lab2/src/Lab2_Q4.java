import java.util.*; 
class FirstMiddleLast {
    
    public static void main(String[] args) {
        
    String first, middle, last;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("First name: ");
    first = scanner.next();
    System.out.print("Middle name: ");
    middle = scanner.next();
    System.out.print("Last name: ");
    last = scanner.next();
    
    System.out.println(first + " " + middle.charAt(0) + ". " + last);
   
    }
    
}