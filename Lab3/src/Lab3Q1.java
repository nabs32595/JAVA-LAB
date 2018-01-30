import java.util.*;
public class Lab3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time, hours, minutes;
        
        System.out.print("Enter Time:");
        time = scanner.nextInt();
        hours = time / 60; 
        minutes = time % 60;
        System.out.print( hours + " hours " + minutes + " minutes ");
        
    }
}
