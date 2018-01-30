class Meal {
    private double points;
    
    public Meal(){
        points = 100;        
    }
    
    public Meal(int p){
        points = p;        
    }
    
    void addpoints(double add){
        points = points + add;
    }
    
    void diductpoints (double ddd){
        if(points < 0){
            System.out.println("cannot purchace");
        }else{
            points = points - ddd;
        }        
    }    
}


class Student{
    private String name,add;
    private int age;

    public Student(String name, String add, int age) {
        this.name = name;
        this.add = add;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public int getAge() {
        return age;
    }
}

public class test{
    public static void main(String[] args) {
        Student s = new Student("nabil", "address",23);        
          
        System.out.println("Student Name:" + s.getName());
        System.out.println("Student Age: " + s.getAge() );
        System.out.println("Student Address: " + s.getAdd());
        
        
    }
}
