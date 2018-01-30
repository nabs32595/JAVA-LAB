class Static_sampel1 {
    static int count = 0;
    
    Static_sampel1(){
        count++;
        System.out.println(count);
    }
    
    public static void main(String[] args) {
       Static_sampel1 c1 = new Static_sampel1();
       Static_sampel1 c2 = new Static_sampel1();
       Static_sampel1 c3 = new Static_sampel1();
    }
    
    
}
