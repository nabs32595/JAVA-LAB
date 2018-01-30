class Ractangel {
    int lenght;
    int bredth;
    
    Ractangel (int l, int b){
        lenght = l;
        bredth = b;
    }
    
    Ractangel getRactangleObject(){
        Ractangel rect = new Ractangel(10,20);
        return rect;
    }
    
}

class Retob {
    public static void main(String[] args) {
        Ractangel ob1 = new Ractangel(40,50);
        Ractangel ob2;
        ob2 = ob1.getRactangleObject();
        System.out.println("ob1.length: " + ob1.lenght);
        System.out.println("ob1.breadth: " + ob1.bredth);
        
        System.out.println("ob2.length: " + ob2.lenght);
        System.out.println("ob2.breadth: " + ob2.bredth);
    }
}