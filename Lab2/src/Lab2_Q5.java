import java.text.SimpleDateFormat;
import java.util.*;

class Lab2_Q5 {    
    public static void main( String[ ] args ) {
    Date today = new Date();
    
    SimpleDateFormat simpleDF;    
    simpleDF = new SimpleDateFormat("EEE MMMM dd, yyyy");
    
    //Display date
    System.out.println( simpleDF.format(today) );
    }
}