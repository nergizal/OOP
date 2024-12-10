package weekten2;



class Animal{
    public void eat(){
        System.out.println("eating..");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }

}
class BabyDog extends Dog{
    public void weep(){
        System.out.println("baby dog is crying..");
    }
}

public class Main {
    
    public static void main(String[] args) {
        BabyDog  Max= new BabyDog();
        Max.eat();
        Max.bark();
        Max.weep();

       
        
    }
    
}
