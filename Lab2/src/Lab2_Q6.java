import java.util.*; 

public class Lab2_Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r, v, pie = 3.142;
        
        System.out.print("Enter Radius : ");
        r = scanner.nextDouble();
        
        v = (4*pie*r*r*r)/3;
                
        System.out.print("\n" + "Raduis of the sphere: " + r + "\n" +
                         "The volume of the sphereis : " + v + "\n");       
        
    }
    
}
