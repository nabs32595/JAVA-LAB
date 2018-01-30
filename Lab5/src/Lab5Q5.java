import java.util.*;
import java.text.*;
class Lab5Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        final double COFFEE_BAG_PRICE = 5.50;
        final double LARGE_BOX_PRICE = 1.80;
        final double MEDIUM_BOX_PRICE = 1.00;
        final double SMALL_BOX_PRICE = 0.60;

        double coffeeBagsOrdered, coffeeCost, subTotal, boxCost;

        int largeBox, mediumBox, smallBox;

        System.out.println("Number of Bags Ordered: ");
        coffeeBagsOrdered = input.nextDouble();

        largeBox = (int) coffeeBagsOrdered / 20;
        mediumBox = (int) (coffeeBagsOrdered % 20) / 10;

        if (coffeeBagsOrdered % 10 <= 5) {
            smallBox = 1;
        } else if (coffeeBagsOrdered % 10 > 5) {
            smallBox = 2;

        } else {
            smallBox = 0;
        }

        boxCost = largeBox * LARGE_BOX_PRICE + mediumBox * MEDIUM_BOX_PRICE + smallBox * SMALL_BOX_PRICE;

        coffeeCost = coffeeBagsOrdered * COFFEE_BAG_PRICE;

        subTotal = coffeeCost + boxCost;

        System.out.println("Boxes Used:");

        if (largeBox > 0) {
            System.out.println("\t" + largeBox + " Large - RM" + (largeBox * LARGE_BOX_PRICE));
        }

        if (mediumBox > 0) {
            System.out.println("\t" + mediumBox + " Medium - RM" + (mediumBox * MEDIUM_BOX_PRICE));
        }

        if (smallBox > 0) {
            System.out.println("\t" + smallBox + " Small - RM" + (smallBox * SMALL_BOX_PRICE));
        }

        System.out.println("Total cost: ");
        System.out.println("Cofee: RM" + coffeeCost);
        System.out.println("Shipment: RM" + df.format(boxCost));
        System.out.println("Total Cost is: RM" + subTotal);

    }
}
