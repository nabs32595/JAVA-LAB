public class Bank {
    public static void main(String[] args) {
   
    Test test = new Test(100.00);
    test.add(25.00);
    test.deduct(50.00);
    
    test.close();
    test.add(10.00);
    
    System.out.println("Has RM " + test.getBalance() + " left in the bank");
    }
}

class Test{
    private double balance;
    private boolean active;
    
    public Test(double startingBalance){
        balance = startingBalance;
        setactive(true);
    }
    
    public void add(double amt){
        if (isActive() && amt > 0) {
            balance = balance + amt;
        }
    }
    
    public void deduct (double amt){
        if (isActive() && amt > 0) {
            double newbalance = balance - amt;
            
            if (newbalance >=0) {
                balance = newbalance;
            }
        }
    }
    
    public void close(){
    setactive(false);
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
    
    private void setactive(boolean state){
        active = state;
    }
}
