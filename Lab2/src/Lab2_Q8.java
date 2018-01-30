import java.util.*; 

public class Lab2_Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        double avg;
        
        System.out.print("Enter 3 number : ");
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();     
        
        avg = (a+b+c) / 3;
                
        System.out.print("average is " + avg);       
        
    }
    
}
