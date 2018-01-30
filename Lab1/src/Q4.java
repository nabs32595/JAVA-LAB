
import java.util.*;
public class Q4 {
    public static void main(String[] args) {         

        String name;
        int age, date;
        double weight;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Hellow there \n");
        System.out.print("Enter Name: ");
        name = scan.next(); // input string
        
        System.out.print("Enter Age: ");
        age = scan.nextInt();
        
        System.out.print("Enter Weight: ");
        weight = scan.nextDouble();
        
        date = (2017 - age);
        
        System.out.print("\n" + "Name: " + name + "\n" +
                         "Year of brith: " + date + "\n" +
                         "Weight: " + weight + "\n" +
                         "Thank You");
    }
}
