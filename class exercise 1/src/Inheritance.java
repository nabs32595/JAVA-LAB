import java.lang.*;

public class Try7 {
    public int i =1;
    protected int j = 2;
    private int k = 3;
}

public class Inheritance extends Try7 {
    
    void method() {
        System.out.println(i);
        System.out.println(k);
        
        Try7 cls = new Try7();
        System.out.println(cls.j);
    }   
    
    public static void main(String[] args) {
        Inheritance try8 = new Inheritance();
        try8.method();
    }
}
 