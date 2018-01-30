import java.util.*;
public class Lab6Q2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int num;
    
        System.out.println("Enter an integer number [other than 0]: ");
        num = scanner.nextInt();
        
        if(num == 0){
        System.out.println("Re-enter an integer number [other than 0]: ");
        num = scanner.nextInt();
        }
        
        System.out.println("Multiplication table for 9 ");

            for (int i = 1; i <= 10; i++)
            {
                System.out.println(i + "x" + num + "=" + (i*num));
            }
      
    }
}
