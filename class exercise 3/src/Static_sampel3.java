class Static_sampel3 {
    static int age = 10;
    static String name = "Ali";
    
    static void display(){
        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);
        
    }
    
    public static void main(String[] args) {
        age = 30;
        name = "steve";
        display();
    }
    
}
