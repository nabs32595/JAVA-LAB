import java.util.Scanner;
public class Lab7Q3 {
    
    public static void main(String[] args) {
    double radius, out_area, in_area, shaded;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Radius of outer circle:: ");
    radius = scanner.nextDouble();
    Circle c_out = new Circle(radius);
    out_area = c_out.calculate_area(radius);
    
    System.out.println("Radius of inner circle:: ");
    radius = scanner.nextDouble();
    Circle c_in = new Circle(radius);
    in_area = c_in.calculate_area(radius);
    
    shaded = out_area - in_area;
    
    System.out.println("Area of the circular region: " + shaded + " " );   
    
}
}

class Circle{
    
    double pi = 3.142;
    double radius, area;
    
    Circle (double r){
    this.radius = r;
    }
    
    double calculate_area(double r){
        return this.pi * r * r;
    }
  
}