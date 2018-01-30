import java.util.*;
public class Lab5Q1 {

    public static void main(String[] args) {
        char code;
        Scanner scan = new Scanner(System.in);
        System.out.println("COLOR & YOU");
        System.out.println("D for black\n"
                + "R for red\n"
                + "B for blue\n"
                + "G for green\n"
                + "Y for yellow\n"
                + "P for purple");
        System.out.print("Enter your favourite color code: ");
        code = scan.next().charAt(0);
        
        switch (code) {
            case 'd':
            case 'D':
                System.out.println("People who choose black as their favorite color are often artistic and sensitive.");
                break;
                
            case 'W':
            case 'w':
                System.out.println("People who like white are often organized and logical and don't have a great deal of clutter in their lives.");
                break;
                
            case 'R':
            case 'r':
                System.out.println("Those who love red live life to the fullest and are tenacious and determined in their endeavors.");
                break;
                
            case 'B':
            case 'b':
                System.out.println("If blue is your favorite color you love harmony, are reliable, sensitive and always make an effort to think of others.");
                break;
                
            case 'G':
            case 'g':
                System.out.println("Those who love the color green are often affectionate, loyal and frank.");
                break;
                
            case 'Y':
            case 'y':
                System.out.println("If yellow is your favorite color, you enjoy learning and sharing your knowledge with others.");
                break;
                
            case 'P':
            case 'p':               
                System.out.println("Those who love purple color are artistic and unique. You have a great respect for people");                
                break;
        }
    }

}