package lab7q1;

public class Lab7Q4 {
    public static void main(String[] args) {        
        
        Author a = new Author("nabil" , "@gmail", 'm');
     
        Book bk_1 = new Book("prgramming", a, 32.90);
        Book bk_2 = new Book("prgramming 2", a, 32.90, 5);
        
        System.out.println(bk_1);
        System.out.println(bk_2);
        
}
}

class Author{
    
    private String name, email;
    char gender;
    
    // sending object Author to Book
    Author(){
       
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){        
    return this.name +"( " + this.gender + " ) at " + this.email;  
    }
        
}

class Book{
                                                                                                                                                                                                                                                                                                                        
    private String name;
    double price;
    int qtyInStock;
    Author author;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    
    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
       
    public Book (String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    public Book (String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    @Override
    public String toString(){        
    return this.name +" By " + author.getName() + "  " + this.getPrice() + " " + this.getQtyInStock();  
    }
 
}