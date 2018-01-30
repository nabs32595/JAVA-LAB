import java.util.Scanner;

public class Lab7Q2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String code, name;
    double previousClosingPrice, currentPrice;  
    
    
    System.out.println("Enter Share code:: ");
    code = scanner.nextLine();
    
    System.out.println("Enter Share name: ");
    name = scanner.nextLine();
    
    System.out.println("Enter previous closing price: ");
    previousClosingPrice = scanner.nextDouble();
    
    System.out.println("Enter current price: ");
    currentPrice = scanner.nextDouble();
    
    Share sh = new Share(code,name);    
    sh.setCurrentPrice(currentPrice);    
    sh.setPreviousClosingPrice(previousClosingPrice);
    
    System.out.println("Changed percentage for share "+sh.code+", "+sh.name+" is "+sh.changePercent());
}

}

class Share{
    String code, name;
    double previousClosingPrice, currentPrice;

    Share (String code, String name){
    this.code = code;
    this.name = name;    
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double changePercent(){
        return (this.currentPrice - this.previousClosingPrice) / this.currentPrice * 100;
    }

}