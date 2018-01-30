public class UseHotelRoom  {
    public static void main(String[] args) {
        
    HotelRoom r1 = new HotelRoom(288);
    r1.display();
    
    HotelRoom r2 = new HotelRoom(300);
    r2.display();
    
    HotelRoom r3 = new Suite(318);
    r3.display();
    
    }

}

class HotelRoom {
    int room_num;
    double rate;
    
    HotelRoom(){}
    
    public HotelRoom(int room_num) {
        this.room_num = room_num;
        if(room_num < 299){
        rate = 190;
        }
        if(room_num > 299){
        rate = 250;
        }

    }
    
    public int getRoom_num() {
        return room_num;
    }

    public double getRate() {
        return rate;
    }
    
    public void setRoom_num(int room_num) {
        this.room_num = room_num;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
   
    public void display(){        
        System.out.println("Regular hotel room – room number " + room_num + " , rental rate is " + rate + ".00 per night");
    }
}

class Suite extends HotelRoom{    
    Suite(){}
    
    public Suite( int room_num) {
        this.room_num = room_num;
        rate = 400;
    }
    
    public void display(){        
        System.out.println("Regular hotel room – room number " + room_num + " , rental rate is " + rate + ".00 per night");
    }
    
}