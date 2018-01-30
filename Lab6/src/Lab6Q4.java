import java.text.DecimalFormat;
import java.util.Scanner;


public class Lab6Q4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    String course_code,course_name,department;
    double credit_hour;
    char grade;
    
    
    System.out.println("Enter Cource Code: ");
    course_code = scanner.nextLine();
    System.out.println("Enter Cource name: ");
    course_name = scanner.nextLine();
    System.out.println("Enter Credit hour ");
    credit_hour = scanner.nextDouble();
    System.out.println("Enter Department ");
    department = scanner.nextLine();
    System.out.println("Enter Grade ");
    grade = scanner.next().charAt(0);
    
    CollegeCourse cc = new CollegeCourse(course_code,course_name,department,credit_hour );
    
    System.out.println("Cource name: " + cc.getCourse_name() );
        
    System.out.println("Cource Code: " + cc.getCourse_code() );
            
    System.out.println("benda tu: " + cc.computeCreditValue(grade) );
    

}
}


class CollegeCourse {
    
    private String course_code,course_name, department;
    private char grade;
    private double credit_hour, credit_value;

    CollegeCourse(){}

    public CollegeCourse(String course_code, String course_name, String department, double credit_hour) {
        this.course_code = course_code;
        this.course_name = course_name;
        this.department = department;
        this.credit_hour = credit_hour;
    }

    public String getCourse_code() {
        return course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public double getCredit_hour() {
        return credit_hour;
    }
    
    
    public double computeCreditValue(char grade){
        
        if(grade == 'A' || grade == 'a' ){ credit_value = 4.0; }
        if(grade == 'B' || grade == 'b' ){ credit_value = 3.0; }
        if(grade == 'C' || grade == 'c' ){ credit_value = 2.0; }
        if(grade == 'D' || grade == 'd' ){ credit_value = 1.0; }
        if(grade == 'E' || grade == 'e' ){ credit_value = 0.0; }
        
        return credit_hour * credit_value;
    }
    
    
    
    
    
}
