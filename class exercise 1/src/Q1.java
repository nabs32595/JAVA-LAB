import static java.lang.Math.pow;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x, y;       
    System.out.print("Enter X: ");
    x = scanner.nextDouble();

    System.out.print("Enter Y: ");
    y = scanner.nextDouble();
    
    MyPoint point = new MyPoint(x,y);    
    point.distance();   
    }    
}

class MyPoint{
private double x, y, originX = 0.0, originY = 0.0;

    MyPoint(){
    x = 0.0;
    y = 0.0;
    }

    MyPoint(double x, double y){
    this.x = x;
    this.y = y;
    } 

    void distance(){
    double d = Math.sqrt( pow((x - originX),2) + pow((y - originY),2) );        
    System.out.print("The distance is " + d );    
    }
}
