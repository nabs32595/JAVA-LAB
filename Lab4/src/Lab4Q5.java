import java.util.*;
public class Lab4Q5 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   
    String color;
    
    Rectangle ractangel1 = new Rectangle(4.0 , 8.0);
    System.out.println("First Rectangle ");
    System.out.println("Width: " + ractangel1.getWidth()  );
    System.out.println("Height: " + ractangel1.getHeight()  );
    System.out.println("Area: " + ractangel1.findArea()  );
    System.out.println("Perimeter: " + ractangel1.findPerimeter()  );
    System.out.println("color: " + ractangel1.getColor()  );
    
    
    Rectangle ractangel2 = new Rectangle(3.5 , 7.0);
    System.out.println("Second Rectangle ");
    System.out.println("Width: " + ractangel1.getWidth()  );
    System.out.println("Height: " + ractangel1.getHeight()  );
    System.out.println("Parameter: " + ractangel1.findArea()  );
    System.out.println("Enter Color: ");
    color = scanner.nextLine();
    ractangel2.setColor (color);
    System.out.println("color: " + ractangel1.getColor()  );
    }
}


class Rectangle{
    private double width  = 1;
    private double height = 1;
    private String colour = "Yellow";
    
    Rectangle (){        
    }
    
    public Rectangle (double w, double h){
    this.width =  w;
    this.height = h;
    }
    
    //ASSESOR
    public double getWidth (){
    return width;  
    }
    
    public double getHeight (){
    return height;    
    }
            
    public String getColor (){
    return colour;    
    }
    
    //MUTATOR
    void setWidth (double w){
        width = w;
    }
    void setHeight (double h){
        height = h;
    }
    void setColor (String c){
        colour = c;
    }
        
    public double findArea (){
    return width * height;
    }
    
    public double findPerimeter (){
    return (width *2) + (height*2);
    }

    
}
