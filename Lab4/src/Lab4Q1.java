import java.util.*;

class Lab4Q1 {
    public static void main(String[] args) {
    int c;
    Random t = new Random();
    
        for (c = 0; c < 5; c++) {            
        int num = t.nextInt(6) + 2;
        System.out.println(num);
        }
    }
}