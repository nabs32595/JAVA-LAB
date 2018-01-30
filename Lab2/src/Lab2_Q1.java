import java.util.*; 
public class Lab2_Q1 {  
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean  bool;        
        System.out.print("you are craving for ice cream: ");        
        bool = scanner.nextBoolean();
        if (bool == true)
            System.out.print("Yes!! i knew it !");
        else
            System.out.print("ok, il treat you next time");
    }
    
}
