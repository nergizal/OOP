package weekeleven2;

class Animal{
    void food(){
        System.out.println("eating..");
    }
}

class Lion extends Animal{
    void food(int x){
        System.out.println("Lion is eating "+x);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj=new Lion();
        obj.food();

        Lion lobj= new Lion();
        lobj.food();
        lobj.food(20);
        
    }
}
