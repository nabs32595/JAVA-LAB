public class Constructor {
    private int x, y;
    private int wid, hei;
        
    public Constructor() {
        this(0, 0, 1, 1);
    }
    public Constructor(int width, int height) {
        this(0, 0, width, height);
    }
    public Constructor(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        wid = width;
        hei = height;
    }
    
    void display(){
        System.out.println(wid +" "+ hei);
    }
    
    public static void main(String[] args) {
    Constructor con = new Constructor(10,15,20,25);
    con.display();
}
}