import java.util.*;
public class Q1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String material;
    
    Shirt shirt1 = new Shirt(32,42);  
    Shirt shirt2 = new Shirt(33,43);
    Shirt shirt3 = new Shirt(34,44);
    
    System.out.println(shirt1);
    System.out.println(shirt2);
    System.out.println(shirt3);
    
    }
    
}

class Shirt{
    
    private int size, sleeve_lenght;
    private String material = "cotton"; 
    
    public Shirt(int c, int l){
    this.size = c;
    this.sleeve_lenght = l;
    }
    
    void setmaterial(String m){
    this.material = m;        
    }
    
    void setcollorsize(int c){
    this.size = c;        
    }
        
    void setsleevelenght(int l){
    this.sleeve_lenght = l;        
    }
    
    public String toString(){        
    return " The Collor size: " + this.size +
           " the sleeve lenght: " + this.sleeve_lenght +
           " the material is : " + this.material;    
    }
        
}