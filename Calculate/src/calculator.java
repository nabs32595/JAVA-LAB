import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double num1, num2;
        
        System.out.print ("Enter first number :");
        num1 = scan.nextDouble();
        
        System.out.print ("Enter second number :");
        num2 = scan.nextDouble();
        
        Calculation cal = new Calculation (num1 , num2);
        cal.display();
        
    }
}

    class Calculation {
        
        private double sum, div, mul, sub;
        private double number1, number2;
        
        Calculation (double num1,double num2) {
            
            this.number1 = num1;
            this.number2 = num2 ;
            this.sum = this.number1 + this.number2;
            this.sub= this.number1 - this.number2;
            this.mul= this.number1 * this.number2;
            this.div= this.number1 / this.number2;
        }
        
        
        void display (){
            System.out.println ("Addition is " + this.sum);
            System.out.println ("Subtraction is" + this.sub);
            System.out.println ("Multiplication is " + this.mul);
            System.out.println ("Division is" + this.div);
        }
}