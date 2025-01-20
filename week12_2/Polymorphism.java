package week12_2;
public class Polymorphism {
}

    
class Animal{
    void animalSound(){
        System.out.println("ses çıkarıyor... vak vak");
    }
}

class Dog extends Animal{
    void animalSound(){
        System.out.println("animal sound.. miyav");
    }
}

class Cat extends Animal{
    void animalSound(){
        System.out.println("möööö");
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal= new Animal();
        Dog dog=new Dog();
        Cat cat=new Cat();

        animal.animalSound();
        dog.animalSound();
        cat.animalSound();

        


    }
}


