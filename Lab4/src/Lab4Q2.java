class Lab4Q2 {
    public static void main( String[] args ) {
    Question q3 = new Question();
        
    q3.init();
    q3.count = q3.increment() + q3.increment();
    System.out.println( q3.count );
    }
}

class Question {
public int count;

    public int init( ) {
    return count = 0;
    }
    
    public int increment() {
    count = count + 2;
    return count;
    }

}