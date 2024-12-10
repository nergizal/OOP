package oop4;
import oop5.*;

public class OpenPlatform {
    public static void main(String[] args) {
        Cat cats =new Cat("Street cat",68,false);

        System.out.println(cats.catBreed);
        System.out.println(cats.catNumber);

        System.out.println(cats.hungryCat());
        System.out.println(Cat.petTheCat());
        cats.isAdopted();

        People human=new People(false);
        System.out.println(human.isAdoptedCat);
        human.humanNumber=150;
    }
}
