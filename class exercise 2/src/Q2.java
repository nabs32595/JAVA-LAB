import java.util.*;
public class Q2 {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String name, address, patientID;
    int age;
    char gender;
  
    for(int i=1; i>3; i++){
    String objectName = "p" + i;    
    Patient objectName = new Patient();
    
    System.out.println("Enter name: ");
    name = scanner.nextLine();
    objectName.setname(name);    

    System.out.println("Enter address: ");    
    address = scanner.nextLine();
    objectName.setaddress(address);    

    System.out.println("Enter patientID: ");
    patientID = scanner.nextLine();
    objectName.setname(patientID);    

    System.out.println("Enter age: ");
    age = scanner.nextInt();
    objectName.setage(age);

    System.out.println("Enter Gender (M / F): ");
    gender = scanner.next().charAt(0);
    objectName.setage(gender);
    
    }   
}

}

class Patient{

private String name, address, patientID;
private int age;
private char gender;

    public Patient(){        
    }

    public Patient(String initialName, String initialID){
        this.name = initialName;
        this.patientID = initialID;
    }
    
    public Patient(String initialID){
        this.patientID = initialID;
    }
    
    void setname(String na){
        this.name = na;
    }
    
    void setaddress(String add){
        this.address = add; 
    }
    
    void setpatientID(String id){
        this.patientID = id;
    }
        
    void setage(int age){
        this.age = age; 
    }
    
    void setgender(char g){
        this.gender = g;
    }
    
    public String getname (){
    return name;  
    }
    
    public String getaddress (){
    return address;  
    }
    
    public String getpatientID (){
    return patientID;  
    }
        
    public int getage (){
    return age;  
    }   
    
    public char getgender (){
    return gender;  
    }
        
    public String toString(){
    return " Patient name: " + this.name +
           " Patient Address: " + this.address +
           " Patient ID: " + this.patientID +
           " Patient Age: " + this.age +
           " Patient Gender: " + this.gender;
    }
}
