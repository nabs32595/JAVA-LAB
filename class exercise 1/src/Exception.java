public class Exception {
    public static void main(String[] args) {
   
        int num1 = 10;
        int num2 = 0;
        int result;
        int arr[] = new int[12];
        
        try{
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            
        result = num1 / num2;
        
        System.out.println("Result of division : " + result);
        
        }catch (ArithmeticException e){
            System.out.println("Err: Division by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println ("Err: Array out of Bound");
        }
}
    
     
}
