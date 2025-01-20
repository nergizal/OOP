package week13;
public class Main {
    //Abstract Classes
    //1)Abstract method have no body
    //If a class has an abstract method class must be abstract also.
    //3)Object can not be created from Abstract class.
    //4) Abstract classes may have methods with body.
    //5) If a class inherits from Abstract Class, It must implement abstract method
    //instantiated:somutlaştırılmış Abstract classes can not be instantiated.

    //Interfaces
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.sound();

        Yamaha obj1=new Yamaha();
        obj1.changeColor();
        obj1.run();

        Honda obj2=new Honda();
        obj2.changeColor();
        obj2.run();
        
            
    }

}

class First{
    void firstfunction(){
        System.out.println("This is our first class");
    }
}

abstract class Animal{
    abstract void sound(); // Abstract method gövdesiz.
    

    void sleep(){ //Somut method
        System.out.println("Animal sleep");
    }
}

class Cat extends Animal{ 
     void sound(){ //Abstract methodu override ddiyor.
        System.out.println("cat meow");
     }
}

class Dog extends Animal{
    void sound(){ //Abstract methodu overrride ediyor.
        System.out.println("Dogs baks");
    } 
}

abstract class Shape{
    abstract void draw(); //Abstract method

}
class Rectangle extends Shape{
    void draw(){ //Abstract methodu override ediyor.
        System.out.println("Drawing rectangle");
    }

}

class Circle extends Shape{
    void draw(){ //Abstract methodu overrride ediyor.
        System.out.println("Drawing Circle");
    }
}

abstract class MotorBike{
    void changeColor(){
        System.out.println("Color changed");
    }
    abstract void run();
} 
class Yamaha extends MotorBike{
    void run(){
        System.out.println("Yamaha motorbikes run ");
    }
}

class Honda extends MotorBike{
    void run(){
        System.out.println("Honda motorbikes run");
    }
}
