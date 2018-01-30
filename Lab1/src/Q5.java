
import javax.swing.*;
import java.util.*;
class Q5 {
    public static void main(String[] args ) {
        int w, h;
        String title;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Weidth: ");
        w = scanner.nextInt();
        System.out.print("Enter Height: ");
        h = scanner.nextInt();
        System.out.print("Title: ");
        
        title = scanner.next();
        JFrame mainWindow;
        mainWindow = new JFrame();
        mainWindow.setTitle( title );
        mainWindow.setSize( w, h );
        mainWindow.setVisible( true );
    }
}