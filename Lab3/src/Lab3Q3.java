import java.util.*;
public class Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quiz1,quiz2,quiz3,totalquiz, midterm, finalexam, finalscore;
        
        System.out.print("Enter quiz 1: ");
        quiz1 = scanner.nextDouble();
        
        System.out.print("Enter quiz 2: ");
        quiz2 = scanner.nextDouble();
        
        System.out.print("Enter quiz 3: ");
        quiz3 = scanner.nextDouble();
        
        totalquiz = (quiz1 + quiz2 + quiz3);
        
        System.out.print("Enter midterm: ");
        midterm = scanner.nextDouble();
        
        System.out.print("Enter final exam: ");
        finalexam = scanner.nextDouble();
        
        finalscore = (totalquiz*1.25) + (midterm*0.35) + (finalexam*0.40);
        
        if(finalscore >= 90){
            System.out.println("Grade is A ");
        }
        if(finalscore >= 80 && finalscore < 90){
            System.out.println("Grade is B ");
        }
        if(finalscore >= 70 && finalscore < 80){
            System.out.println("Grade is C ");
        }
        if(finalscore >= 60 && finalscore < 70){
            System.out.println("Grade is D ");
        }
        if(finalscore <60){
            System.out.println("Grade is F");
        }
        
        System.out.println("First quiz score: " + quiz1);
        System.out.println("Second quiz score: " + quiz2);
        System.out.println("Third quiz score: " + quiz3);
        System.out.println("Total quiz score is " + totalquiz);
        System.out.println("Midterm Exam score: " + midterm);
        System.out.println("Final Exam score: " + finalexam);
    }
    
}
