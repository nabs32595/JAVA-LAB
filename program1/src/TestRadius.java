import java.lang.*;
import java.util.*;
import java.text.*;

public class TestRadius  {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double r;
        
    System.out.println("Enter Radius: ");
    r = scanner.nextDouble();
    Radius s1 = new Radius(r);
    s1.calvolume();
    System.out.println("Sphere 1 ");
    System.out.println(s1);
    
    System.out.println("Sphere 2 ");
    Radius s2 = new Radius(12);
    s2.calvolume();
    System.out.println(s2);  
     
    }
}

class Radius{
    private double radius, volume;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return volume;
    }
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    Radius(){}
    
    public Radius(double r){
        this.radius = r;    
    }
    
    void calvolume(){
    this.volume = ( (4/3) * Math.PI * Math.pow(this.radius, 3) ); 
    }
    
    public String toString(){        
    return " Radius of the sphere: " + this.radius +
           " The volume of the sphere with radius " + this.radius + " is " + df.format(this.volume);  
    }
}



