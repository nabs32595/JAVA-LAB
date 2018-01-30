
import java.util.*;

public class Lab5Q4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year, month, days = 0;
        String status = "normal";
        System.out.println("Enter Year");
        year = scan.nextInt();

        System.out.println("Enter Month");
        month = scan.nextInt();

        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            status = "leap";
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;

                break;
            case 2:
                if (status == "leap") {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

        }
        System.out.println("total days of this month on " + status + " year is " + days);

    }
}
